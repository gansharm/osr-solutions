const router =
require("express")
.Router();

const {
  getAdminEmail,
  signToken,
  verifyAdminCredentials,
  verifyToken,
} = require(
  "../utils/adminAuth"
);

router.post(
  "/login",
  (req, res) => {
    try {
      const email = String(req.body.email || "").trim();
      const password = String(req.body.password || "");

      if (!email || !password || !verifyAdminCredentials({ email, password })) {
        return res.status(401)
        .json({
          success: false,
          message: "Invalid admin email or password",
        });
      }

      const adminEmail = getAdminEmail();
      const token = signToken({
        email: adminEmail,
        role: "admin",
      });

      res.json({
        success: true,
        token,
        admin: {
          email: adminEmail,
          role: "admin",
        },
      });
    } catch (error) {
      console.log(error);

      res.status(500)
      .json({
        success: false,
        message: "Unable to login admin",
      });
    }
  }
);

router.get(
  "/me",
  (req, res) => {
    const authHeader = req.headers.authorization || "";
    const token = authHeader.startsWith("Bearer ")
      ? authHeader.slice(7)
      : "";
    const payload = verifyToken(token);

    if (!payload?.email) {
      return res.status(401)
      .json({
        success: false,
        message: "Admin login required",
      });
    }

    res.json({
      success: true,
      admin: {
        email: payload.email,
        role: payload.role || "admin",
      },
    });
  }
);

module.exports =
router;
