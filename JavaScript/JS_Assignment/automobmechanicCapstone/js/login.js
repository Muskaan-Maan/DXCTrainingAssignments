function checkLogin() {
    var username = document.getElementById("uname").value;
    var password = document.getElementById("pwd").value;
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "../js/users.json", true);
    xhr.onload = function() {
      if (xhr.status == 200) {
        var users = JSON.parse(xhr.responseText).users;
        var user = users.find(u => u.username === username && u.password === password);
        if (user) {
          if (user.role === "admin") {
            window.location.href = "admin.html";
          } else if (user.role === "user") {
            window.location.href = "user.html";
          }
        } else {
          alert("Invalid username or password");
        }
      }
    }
    xhr.send();
  }