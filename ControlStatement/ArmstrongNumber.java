import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        checkArmstrong(n);
    }

    public static void checkArmstrong(int n) {

        int temp = n;
        int count = 0;
        int nod = 0;
        int sum = 0;

        while(temp > 0) {

            temp /= 10;
            count++;
        }

        nod = count;

        temp = n;

        while(temp > 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, nod);
            temp /= 10;

        }

        if(sum == n) {
            System.out.println(n + " is an Armstrong Number");
        }else {
            System.out.println(n + " is not an Armstrong Number");
        }

    }

}
