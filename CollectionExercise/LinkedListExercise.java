package CollectionExercise;

import java.util.*;

class LinkedListExercise {

    public static List<Object> descendingIterator(List<Object> listTwo) {

        List<Object> list2 = new LinkedList<>();

        ListIterator<Object> li = listTwo.listIterator(listTwo.size());

        while(li.hasPrevious()){
            list2.add(li.previous());
        }

        return list2;

    }
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {

        List<Object> concatenatedList = new LinkedList<>();

        listOne.listIterator();

        concatenatedList.addAll(listOne);
        concatenatedList.addAll(descendingIterator(listTwo));

        return concatenatedList;
    }

    public static void main(String[] args) {
        List<Object> listOne = new LinkedList<Object>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);
        List<Object> listTwo = new LinkedList<Object>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");
        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");

        for (Object value : concatenatedList) {
            System.out.print(value + " ");
        }
    }
}
