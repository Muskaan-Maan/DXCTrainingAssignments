package CollectionAssignment;

import java.util.*;

public class TesterSet1 {

    public static Set<StudentSet1> findUnique(List<StudentSet1> students) {

        Set<StudentSet1> unique = new HashSet<>(students);

        return unique;
    }

    public static Set<StudentSet1> findDuplicates(List<StudentSet1> students) {

        HashSet<Integer> list=new HashSet<Integer>();

        HashSet<StudentSet1> duplicate=new HashSet<StudentSet1>();


        for (StudentSet1 student : students) {

            if (!list.contains(student.getStudentId()))

                list.add(student.getStudentId());

            else

                duplicate.add(student);
        }

        return duplicate;
    }

    public static void main(String[] args) {

        List<StudentSet1> students = new ArrayList<StudentSet1>();

        students.add(new StudentSet1(5004, "Wyatt", "Wyatt@example.com","Dance"));
        students.add(new StudentSet1(5010, "Lucy", "Lucy@example.com","Dance"));
        students.add(new StudentSet1(5550, "Aaron", "Aaron@example.com","Dance"));
        students.add(new StudentSet1(5560, "Ruby", "Ruby@example.com","Dance"));
        students.add(new StudentSet1(5015, "Sophie", "Sophie@example.com","Music"));
        students.add(new StudentSet1(5013, "Clara", "Clara@example.com","Music"));
        students.add(new StudentSet1(5010, "Lucy", "Lucy@example.com","Music"));
        students.add(new StudentSet1(5011, "Ivan", "Ivan@example.com","Music"));
        students.add(new StudentSet1(5550, "Aaron", "Aaron@example.com","Music"));

        Set<StudentSet1> studentNominations = findUnique(students);
        System.out.println("Students who have submitted nominations");
        for(StudentSet1 student: studentNominations)
            System.out.println(student);

        Set<StudentSet1> duplicateStudents = findDuplicates(students);
        System.out.println("Students who have submitted nominations for both the events");
        for(StudentSet1 student: duplicateStudents)
            System.out.println(student);
    }
}

