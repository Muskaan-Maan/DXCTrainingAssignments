package CollectionAssignment;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue2 {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {

        Deque<Character> initialStack = new ArrayDeque<>(inputStack);
        Deque<Character> resultStack = new ArrayDeque<>();
        Deque<Character> tempStack = new ArrayDeque<>();

        while (!initialStack.isEmpty()) {
            tempStack.push(initialStack.remove());
        }

        for (int i = 0; i < 3; ++i) {
            initialStack.push(tempStack.remove());
        }

        while (!tempStack.isEmpty()) {
            resultStack.push(tempStack.remove());
        }

        while (!initialStack.isEmpty()) {
            tempStack.push(initialStack.remove());
        }
        while (!tempStack.isEmpty()) {
            resultStack.push(tempStack.remove());
        }

        return resultStack;
    }

    public static void main(String[] args) {

        Deque<Character> inputStack = new ArrayDeque<Character>();
        inputStack.push('E');
        inputStack.push('D');
        inputStack.push('C');
        inputStack.push('B');
        inputStack.push('A');

        Deque<Character> resultStack = updateStack(inputStack);

        System.out.println("The alphabets in updated stack are:");
        for(Character alphabet: resultStack)
            System.out.println(alphabet);
    }

}