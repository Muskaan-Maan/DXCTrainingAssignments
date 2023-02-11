import java.util.HashSet;
import java.util.Set;

public class HashSet_1 {

    public static void main(String[] args) {

        Set<String> s1 = new HashSet<>();
        s1.add("Chemistry");
        s1.add("Mathematics");
        s1.add("Biology");
        s1.add("English");

        Set<String> s2 = new HashSet<>();
        s2.add("Biology");
        s2.add("English");
        s2.add("Geography");
        s2.add("Physics");

        Set<String> s1Clone = new HashSet<>(s1);
        Set<String> s2Clone = new HashSet<>(s2);

        s1Clone.removeAll(s2);
        System.out.println("Subjects only present in the first stack: " + s1Clone);


        s2Clone.removeAll(s1);
        System.out.println("Subjects only present in the second stack: " + s2Clone);


        s1.retainAll(s2);
        System.out.println("Subjects present in both stacks: " + s2);
    }
}

