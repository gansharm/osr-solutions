const mongoose =
require("mongoose");

const reviewSchema =
new mongoose.Schema(
  {
    name: {
      type: String,
      required: true,
      trim: true,
      maxlength: 80,
    },

    companyName: {
      type: String,
      trim: true,
      maxlength: 120,
      default: "",
    },

    rating: {
      type: Number,
      required: true,
      min: 1,
      max: 5,
    },

    review: {
      type: String,
      required: true,
      trim: true,
      maxlength: 700,
    },

    photoUrl: {
      type: String,
      trim: true,
      maxlength: 7000000,
      default: "",
    },

    status: {
      type: String,
      enum: [
        "pending",
        "approved",
        "rejected",
      ],
      default: "pending",
      index: true,
    },

    createdAt: {
      type: Date,
      default: Date.now,
      index: true,
    },
  },
  {
    collection: "reviews",
    versionKey: false,
  }
);

module.exports =
mongoose.model(
  "Review",
  reviewSchema
);
