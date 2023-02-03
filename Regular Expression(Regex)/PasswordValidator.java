public class PasswordValidator {

    public static boolean checkPasswordValidity(String password) {


        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&*_]).{8,20}";


        if (password.matches(regex))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {


        String password1 = "A7@$WGjDST";
        String password2 = "%$bndfaG34G";
        String password3 = "fjbFKWf09378";
        String password4 = "FNdn$3";

        String[] passwords = {password1, password2, password3, password4};

        for (String p : passwords) {
            System.out.println("The password is " + (checkPasswordValidity(p) ? "valid!" : "invalid!"));
        }
    }
}
