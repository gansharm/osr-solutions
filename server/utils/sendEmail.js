const nodemailer =
require("nodemailer");

const sendEmail =
async (data) => {

  try {

    const transporter =
      nodemailer.createTransport({

        host:
          "smtp.gmail.com",

        port: 587,

        secure: false,

        auth: {
          user:
            process.env
              .EMAIL_USER,

          pass:
            process.env
              .EMAIL_PASS,
        },

        tls: {
          rejectUnauthorized:
            false,
        },
      });

    await transporter
      .sendMail({

        from:
          `"OSR Solutions" <${process.env.EMAIL_USER}>`,

        to:
          "osrsolutions51@gmail.com",

        replyTo:
          data.email,

        subject:
          "🚀 New Contact Form Submission",

        html: `
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
      });

    console.log(
      "Email Sent ✅"
    );

  } catch (error) {

    console.log(
      "Email Error:",
      error
    );
  }
};

module.exports =
sendEmail;