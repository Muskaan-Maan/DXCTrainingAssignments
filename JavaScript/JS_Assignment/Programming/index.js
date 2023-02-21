const User = require("./login.js").default;

function validateUser() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    const result = User.validate(username, password);
    if (result === "Login Successful") {
      alert("Login Successful");
    } else {
      alert("Unauthorized access");
    }
  }