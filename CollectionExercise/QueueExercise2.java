package CollectionExercise;


import java.util.*;

public class QueueExercise2 {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(8);
        stack.push(5);
        stack.push(12);
        stack.push(5);

        Deque<Integer> result = changeSmallest(stack);
        System.out.println(result);
    }

    public static Deque<Integer> changeSmallest(Deque<Integer> st){

        int min = Integer.MAX_VALUE;

        Deque<Integer> temp = new ArrayDeque<>(st);

        for (Integer value : temp){
            if (min > value)
                min = value;
        }

        int nom = 0;

        for (Integer value : temp){
            if (value == min){
                temp.removeFirstOccurrence(min);
                nom += 1;
            }
        }

        for (int i = 0; i < nom; i++){
            temp.addLast(min);
        }

       return temp;
    }
}

