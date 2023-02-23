package CollectionAssignment;

import java.util.*;

public class LinkedListAssign1 {

        public static List<Integer> removeDuplicates(List<Integer> list) {

            LinkedList<Integer> unique = new LinkedList<Integer>();

            for(Integer l : list)
            {
                if(!unique.contains(l))
                    unique.add(l);
            }
            return unique;
        }

        public static void main(String[] args) {

            List<Integer> list = new LinkedList<Integer>();
            list.add(10);
            list.add(15);
            list.add(21);
            list.add(15);
            list.add(10);

            List<Integer> updatedList = removeDuplicates(list);

            System.out.println("Linked list without duplicates");
            for (Integer value : updatedList) {
                System.out.print(value+" ");
            }
        }


}
