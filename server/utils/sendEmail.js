const axios =
require("axios");

const sendEmail =
async (data) => {

  try {

    console.log(
      process.env
        .BREVO_API_KEY
        ? "API KEY FOUND"
        : "API KEY MISSING"
    );

    const response =
      await axios.post(
        "https://api.brevo.com/v3/smtp/email",
        {
          sender: {
            name:
              "OSR Solutions",
            email:
              "osrsolutions51@gmail.com",
          },

          to: [
            {
              email:
                "osrsolutions51@gmail.com",
            },
          ],

          replyTo: {
            email:
              data.email,
          },

          subject:
            "🚀 New Contact Form Submission",

          htmlContent: `
            <h2>
              New Customer Inquiry
            </h2>

            <p>
              <strong>Name:</strong>
              ${data.name}
            </p>

            <p>
              <strong>Email:</strong>
              ${data.email}
            </p>

            <p>
              <strong>Phone:</strong>
              ${data.phone}
            </p>

            <p>
              <strong>Service:</strong>
              ${data.service}
            </p>

            <p>
              <strong>Message:</strong>
              ${data.message}
            </p>
          `,
        },
        {
          headers: {
            accept:
              "application/json",

            "api-key":
              process.env
                .BREVO_API_KEY,

            "content-type":
              "application/json",
          },
        }
      );

    console.log(
      "Email Sent ✅"
    );

    console.log(
      response.data
    );

  } catch (error) {

    console.log(
      "Email Error:",
      error.response
        ?.data ||
        error.message
    );
  }
};

module.exports =
sendEmail;