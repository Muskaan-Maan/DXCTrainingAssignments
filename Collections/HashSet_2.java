import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_2 {

    public static void main(String[] args) {

        Set<String> st = new HashSet<>();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the names of students who have attended the course (enter 'q' to quit):");

        while (true) {
            System.out.print("Name: ");
            String name = scn.nextLine();
            if (name.equals("None")) {
                break;
            }
            st.add(name);
        }

        Set<String> sortedSt = new TreeSet<>(st);

        System.out.println("\nStudents who have attended the course:");

        for (String name : sortedSt) {
            System.out.println(name);
        }
        System.out.println("\nTotal number of students: " + sortedSt.size());
    }
}
