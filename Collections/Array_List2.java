/*(Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers.
The method returns null if the list is null or the list size is 0.*/


import java.util.ArrayList;
import java.util.Scanner;

public class Array_List2 {

    public static Integer max(ArrayList<Integer> aL) {
        if (aL == null || aL.size() == 0) {
            return null;
        }

        int max = aL.get(0);
        for (int i = 1; i < aL.size(); i++) {
            if (aL.get(i) > max) {
                max = aL.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of values to be inserted in arraylist");
        int n = scn.nextInt();
        System.out.println("Enter the values");

        for (int i = 0; i < n; i++) {
            int m = scn.nextInt();
            arr.add(m);
        }

        Integer max = max(arr);

        if (max == null) {
            System.out.println("Null");
        } else {
            System.out.println("Maximum element in array list is: " + max);
        }
    }
}
