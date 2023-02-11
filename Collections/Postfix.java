import java.util.*;

public class Postfix {


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Integer> v = new Stack<>();
        Stack<String> j = new Stack<>();
        Stack<String> p = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = v.pop();
                int v1 = v.pop();
                int val = operation(v1, v2, ch);
                v.push(val);

                String iv2 = j.pop();
                String iv1 = j.pop();
                String iVal = "(" + iv1 + ch + iv2 + ")";
                j.push(iVal);

                String pv2 = p.pop();
                String pv1 = p.pop();
                String pVal = ch + pv1 + pv2;
                p.push(pVal);
            } else {
                v.push(ch - '0');
                j.push(ch + "");
                p.push(ch + "");
            }
        }
        System.out.println(v.pop());
        System.out.println(j.pop());
        System.out.println(p.pop());
    }
    public static int operation (int v1, int v2, char op) {  //8


        if (op == '+') {
            return v1 + v2;
        } else if (op == '-') {
            return v1 - v2;
        } else if (op == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }

    }
}