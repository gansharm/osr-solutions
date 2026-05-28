const router =
require("express")
.Router();

const Contact =
require(
  "../models/Contact"
);

const sendEmail =
require(
  "../utils/sendEmail"
);

router.post(
  "/",
  async (req, res) => {

    try {

      const contact =
        new Contact(
          req.body
        );

      await contact
        .save();

      // Respond immediately
      res.status(201)
      .json({
        success: true,
        message:
          "Form Submitted",
      });

      // Send email after response
      sendEmail(
        req.body
      );

    } catch (error) {

      console.log(
        error
      );

      res.status(500)
      .json({
        success: false,
        message:
          error.message,
      });
    }
  }
);

module.exports =
router;