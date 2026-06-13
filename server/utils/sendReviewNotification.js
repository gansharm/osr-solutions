const axios =
require("axios");

const escapeHtml = (value) =>
  String(value || "")
    .replace(/&/g, "&amp;")
    .replace(/</g, "&lt;")
    .replace(/>/g, "&gt;")
    .replace(/"/g, "&quot;")
    .replace(/'/g, "&#039;");

const sendReviewNotification =
async (review) => {
  if (!process.env.BREVO_API_KEY) {
    console.log("Review email skipped: BREVO_API_KEY missing");
    return;
  }

  const adminEmail =
    process.env.ADMIN_REVIEW_EMAIL ||
    process.env.ADMIN_EMAIL ||
    process.env.EMAIL_USER ||
    "osrsolutions51@gmail.com";

  const senderEmail =
    process.env.EMAIL_USER ||
    "osrsolutions51@gmail.com";

  const adminUrl =
    process.env.ADMIN_REVIEWS_URL ||
    "https://osrsolutions.in/admin/reviews";

  try {
    await axios.post(
      "https://api.brevo.com/v3/smtp/email",
      {
        sender: {
          name: "OSR Solutions",
          email: senderEmail,
        },

        to: [
          {
            email: adminEmail,
          },
        ],

        subject: "New Review Pending Approval",

        htmlContent: `
          <h2>New Customer Review Pending Approval</h2>

          <p><strong>Name:</strong> ${escapeHtml(review.name)}</p>
          <p><strong>Company:</strong> ${escapeHtml(review.companyName || "Not provided")}</p>
          <p><strong>Rating:</strong> ${escapeHtml(review.rating)} / 5</p>
          <p><strong>Status:</strong> pending</p>

          <p>
            <strong>Review:</strong><br />
            ${escapeHtml(review.review)}
          </p>

          <p>
            Approve or reject this review here:
            <a href="${adminUrl}">${adminUrl}</a>
          </p>
        `,
      },
      {
        headers: {
          "api-key": process.env.BREVO_API_KEY,
          accept: "application/json",
          "content-type": "application/json",
        },
      }
    );

    console.log("Review notification email sent");
  } catch (error) {
    console.log(
      "Review Email Error:",
      error.response?.data ||
      error.message
    );
  }
};

module.exports =
sendReviewNotification;
