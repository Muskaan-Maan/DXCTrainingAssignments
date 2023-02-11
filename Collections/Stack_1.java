import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Stack<String> st = new Stack<>();


        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            st.push(scn.next());
        }


        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
}
