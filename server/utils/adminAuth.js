const crypto =
require("crypto");

const TOKEN_TTL_MS =
  8 * 60 * 60 * 1000;

const base64UrlEncode = (value) =>
  Buffer.from(value)
    .toString("base64url");

const base64UrlDecode = (value) =>
  Buffer.from(value, "base64url")
    .toString("utf8");

const getAdminEmail = () =>
  process.env.ADMIN_EMAIL ||
  process.env.EMAIL_USER ||
  "osrsolutions51@gmail.com";

const getTokenSecret = () =>
  process.env.ADMIN_TOKEN_SECRET ||
  process.env.JWT_SECRET ||
  process.env.BREVO_API_KEY ||
  process.env.EMAIL_PASS ||
  process.env.MONGODB_URI ||
  process.env.MONGO_URI;

const safeCompare = (left, right) => {
  const leftBuffer = Buffer.from(String(left || ""));
  const rightBuffer = Buffer.from(String(right || ""));

  if (leftBuffer.length !== rightBuffer.length) {
    return false;
  }

  return crypto.timingSafeEqual(leftBuffer, rightBuffer);
};

const verifyPasswordHash = (password) => {
  const hash = process.env.ADMIN_PASSWORD_HASH;
  const salt = process.env.ADMIN_PASSWORD_SALT;

  if (!hash || !salt) {
    return false;
  }

  const derivedHash = crypto
    .scryptSync(password, salt, 64)
    .toString("hex");

  return safeCompare(derivedHash, hash);
};

const verifyAdminCredentials = ({ email, password }) => {
  const expectedEmail = getAdminEmail();

  if (!safeCompare(String(email || "").toLowerCase(), expectedEmail.toLowerCase())) {
    return false;
  }

  if (verifyPasswordHash(password)) {
    return true;
  }

  if (process.env.ADMIN_PASSWORD) {
    return safeCompare(password, process.env.ADMIN_PASSWORD);
  }

  if (process.env.EMAIL_PASS) {
    return safeCompare(password, process.env.EMAIL_PASS);
  }

  return false;
};

const signToken = (payload) => {
  const secret = getTokenSecret();

  if (!secret) {
    throw new Error("Admin token secret is not configured");
  }

  const encodedPayload = base64UrlEncode(
    JSON.stringify({
      ...payload,
      exp: Date.now() + TOKEN_TTL_MS,
    })
  );

  const signature = crypto
    .createHmac("sha256", secret)
    .update(encodedPayload)
    .digest("base64url");

  return `${encodedPayload}.${signature}`;
};

const verifyToken = (token) => {
  const secret = getTokenSecret();

  if (!secret || !token || !token.includes(".")) {
    return null;
  }

  const [encodedPayload, signature] = token.split(".");
  const expectedSignature = crypto
    .createHmac("sha256", secret)
    .update(encodedPayload)
    .digest("base64url");

  if (!safeCompare(signature, expectedSignature)) {
    return null;
  }

  try {
    const payload = JSON.parse(base64UrlDecode(encodedPayload));

    if (!payload.exp || payload.exp < Date.now()) {
      return null;
    }

    return payload;
  } catch (error) {
    return null;
  }
};

const requireAdmin = (req, res, next) => {
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

  req.admin = payload;
  next();
};

module.exports = {
  getAdminEmail,
  requireAdmin,
  signToken,
  verifyAdminCredentials,
  verifyToken,
};
