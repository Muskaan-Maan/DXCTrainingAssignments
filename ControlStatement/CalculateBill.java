import java.util.*;

public class CalculateBill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);
        int quantity = scn.nextInt();
        int distance = scn.nextInt();

        int vegCombo = 12;
        int nonVegCombo = 15;
        int bill = 0;

        if (ch == 'V' || ch == 'N' && quantity > 0 && distance > 0) {
            if (ch == 'V') {
                if (distance <= 3) {
                    bill = bill + (quantity * vegCombo);
                } else if (distance > 3 && distance <= 6) {
                    bill = bill + ((quantity * vegCombo) + (distance - 3));
                } else {
                    bill = bill + ((quantity * vegCombo) + ((distance - 6) * 2)) + 3;
                }
            } else {
                if (distance <= 3) {
                    bill = bill + (quantity * nonVegCombo);
                } else if (distance > 3 && distance <= 6) {
                    bill = bill + ((quantity * nonVegCombo) + (distance - 3));
                } else {
                    bill = bill + ((quantity * nonVegCombo) + ((distance - 6) * 2)) + 3;
                }
            }
        } else {
            bill = -1;
        }

        System.out.println("Total Bill Amount : " + bill);
    }

}
