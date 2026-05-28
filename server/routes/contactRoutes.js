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

      // Send email
      await sendEmail(
        req.body
      );

      res.status(201)
      .json({
        success: true,
        message:
          "Form Submitted",
      });

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