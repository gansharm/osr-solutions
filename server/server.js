const express =
require("express");

const mongoose =
require("mongoose");

const cors =
require("cors");

require("dotenv")
.config();

require("dns")
.setDefaultResultOrder(
  "ipv4first"
);

const app = express();
const mongoUri =
  process.env.MONGODB_URI ||
  process.env.MONGO_URI;

/* MIDDLEWARE */
app.use(cors());
app.use(express.json({ limit: "8mb" }));
app.use(express.urlencoded({ extended: true, limit: "8mb" }));

/* ROUTES */
app.use(
  "/api/contact",
  require(
    "./routes/contactRoutes"
  )
);

app.use(
  "/api/admin",
  require(
    "./routes/adminRoutes"
  )
);

app.use(
  "/api/reviews",
  require(
    "./routes/reviewRoutes"
  )
);

/* DB CONNECTION */
mongoose
  .connect(
    mongoUri
  )
  .then(() =>
    console.log(
      "MongoDB Connected"
    )
  )
  .catch((err) =>
    console.log(err)
  );

/* SERVER */
const PORT =
process.env.PORT ||
5000;

app.listen(PORT, () =>
  console.log(
    `Server running on ${PORT}`
  )
);
