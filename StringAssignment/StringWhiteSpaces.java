import java.util.*;


//Code for Remove white spaces from a String and move special character in a string to the last position

public class StringWhiteSpaces {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        removeWhiteSpaces(str);
        System.out.println(moveSpecialCharacters(str));
    }

    public static void removeWhiteSpaces(String str){

        System.out.println(str.replace(" ", ""));
    }

    public static String moveSpecialCharacters(String str){

        String specialCh = "[a-zA-Z0-9\\s+]";
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (str.valueOf(ch).matches(specialCh)){
                s1 += ch;
            }else {
                s2 += ch;
            }
        }

        String s = s1 + s2;
        return s.replace(" ", "");
    }
}
