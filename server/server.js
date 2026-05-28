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

/* MIDDLEWARE */
app.use(cors());
app.use(express.json());

/* ROUTES */
app.use(
  "/api/contact",
  require(
    "./routes/contactRoutes"
  )
);

/* DB CONNECTION */
mongoose
  .connect(
    process.env.MONGO_URI
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