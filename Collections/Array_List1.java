import java.util.*;

public class Array_List1 {
    public static void solution(ArrayList<Integer> a) {

        for (int i = a.size() - 1; i >= 0; i--) {

            if (isPrime(a.get(i))) {
                a.remove(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> aL = new ArrayList<>();

        for (int i = 0 ; i < n; i++) {
            aL.add(scn.nextInt());
        }

        solution(aL);
        System.out.println(aL);
}
}
