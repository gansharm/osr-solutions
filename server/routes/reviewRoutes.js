const router =
require("express")
.Router();

const Review =
require(
  "../models/Review"
);

const {
  requireAdmin,
} = require(
  "../utils/adminAuth"
);

const sendReviewNotification =
require(
  "../utils/sendReviewNotification"
);

const VALID_STATUSES = [
  "pending",
  "approved",
  "rejected",
];

const MAX_PHOTO_LENGTH = 7000000;

const normalizeText = (value) => {
  if (typeof value !== "string") {
    return "";
  }

  return value.trim();
};

const isValidPhotoUrl = (photoUrl) => {
  if (!photoUrl) {
    return true;
  }

  if (photoUrl.length > MAX_PHOTO_LENGTH) {
    return false;
  }

  return /^data:image\/(png|jpe?g|webp);base64,/i.test(photoUrl) ||
    /^https?:\/\/.+/i.test(photoUrl);
};

const serializeReview = (review) => ({
  id: review._id,
  name: review.name,
  companyName: review.companyName,
  rating: review.rating,
  review: review.review,
  photoUrl: review.photoUrl,
  status: review.status,
  createdAt: review.createdAt,
});

router.get(
  "/",
  async (req, res) => {
    try {
      const reviews = await Review
        .find({ status: "approved" })
        .sort({ createdAt: -1 })
        .lean();

      res.json({
        success: true,
        reviews: reviews.map((review) => ({
          id: review._id,
          name: review.name,
          companyName: review.companyName,
          rating: review.rating,
          review: review.review,
          photoUrl: review.photoUrl,
          createdAt: review.createdAt,
        })),
      });
    } catch (error) {
      console.log(error);

      res.status(500)
      .json({
        success: false,
        message: "Unable to load reviews",
      });
    }
  }
);

router.post(
  "/",
  async (req, res) => {
    try {
      const name = normalizeText(req.body.name);
      const companyName = normalizeText(req.body.companyName);
      const review = normalizeText(req.body.review);
      const photoUrl = normalizeText(req.body.photoUrl);
      const rating = Number(req.body.rating);

      if (!name || !review || !Number.isInteger(rating)) {
        return res.status(400)
        .json({
          success: false,
          message: "Name, rating, and review message are required",
        });
      }

      if (rating < 1 || rating > 5) {
        return res.status(400)
        .json({
          success: false,
          message: "Rating must be between 1 and 5",
        });
      }

      if (name.length > 80 || companyName.length > 120 || review.length > 700) {
        return res.status(400)
        .json({
          success: false,
          message: "Please keep your review details within the allowed length",
        });
      }

      if (!isValidPhotoUrl(photoUrl)) {
        return res.status(400)
        .json({
          success: false,
          message: "Photo must be a JPG, PNG, or WEBP image under 5MB",
        });
      }

      const savedReview = await Review.create({
        name,
        companyName,
        rating,
        review,
        photoUrl,
        status: "pending",
      });

      res.status(201)
      .json({
        success: true,
        message: "Review submitted for approval",
        review: serializeReview(savedReview),
      });

      sendReviewNotification(savedReview);
    } catch (error) {
      console.log(error);

      res.status(500)
      .json({
        success: false,
        message: "Unable to submit review",
      });
    }
  }
);

router.get(
  "/admin",
  requireAdmin,
  async (req, res) => {
    try {
      const status = normalizeText(req.query.status);
      const filter = VALID_STATUSES.includes(status) ? { status } : {};

      const reviews = await Review
        .find(filter)
        .sort({ createdAt: -1 });

      res.json({
        success: true,
        reviews: reviews.map(serializeReview),
      });
    } catch (error) {
      console.log(error);

      res.status(500)
      .json({
        success: false,
        message: "Unable to load admin reviews",
      });
    }
  }
);

router.patch(
  "/admin/:id/status",
  requireAdmin,
  async (req, res) => {
    try {
      const status = normalizeText(req.body.status);

      if (!VALID_STATUSES.includes(status)) {
        return res.status(400)
        .json({
          success: false,
          message: "Invalid review status",
        });
      }

      const review = await Review.findByIdAndUpdate(
        req.params.id,
        { status },
        { new: true, runValidators: true }
      );

      if (!review) {
        return res.status(404)
        .json({
          success: false,
          message: "Review not found",
        });
      }

      res.json({
        success: true,
        message: `Review ${status}`,
        review: serializeReview(review),
      });
    } catch (error) {
      console.log(error);

      res.status(500)
      .json({
        success: false,
        message: "Unable to update review status",
      });
    }
  }
);

module.exports =
router;
