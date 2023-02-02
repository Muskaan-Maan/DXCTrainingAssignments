import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        isPalindrome(n);
    }

    public static void isPalindrome(int n){

        int sum = 0;
        int temp = n;

        while (temp > 0){
            int rem = temp % 10;
            sum = (sum * 10) + rem;
            temp /= 10;
        }

        if (sum == n){
            System.out.println(n + " is a Palindrome");
        }
        else {
            System.out.println(n + " is not a Palindrome");
        }
    }
}
