import java.util.*;

public class LuckyNumber {

    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

        luckyNumber(n);

    }

    public static int reverse(int n){
        int sum = 0;
        int temp = n;

        while (temp > 0){
            int rem = temp % 10;
            sum = (sum * 10) + rem;
            temp /= 10;
        }

        return sum;
    }


    public static void luckyNumber(int n){

        int sum = 0;
        int c = 1;
        int temp = reverse(n);


        while (temp != 0) {

            if (c % 2 == 0) {
                int d = temp % 10;
                sum = sum + (int) Math.pow(d, 2);
            }

            temp /= 10;
            c++;
        }



        if(sum % 9 == 0){
            System.out.println("The number " + n + " is a lucky Number");
        }else{
            System.out.println("The number " + n + " is not a lucky Number");
        }

    }
}
