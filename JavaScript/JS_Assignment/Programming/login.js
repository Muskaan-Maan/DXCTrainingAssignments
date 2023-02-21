class User {
    static validate(username, password) {
      if (username === password) {
        return "Login Successful";
      } else {
        return "Unauthorized access";
      }
    }
  }
  
  export default User;
  