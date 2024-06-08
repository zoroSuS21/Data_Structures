package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingArrayDeque<T> {
    private Deque<T> deque;

    public StackUsingArrayDeque() {
        deque = new ArrayDeque<>();
    }

    // Push element onto the stack
    public void push(T element) {
        deque.addFirst(element);
    }

    // Pop element from the stack
    public T pop() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop element.");
        }
        return deque.removeFirst();
    }

    // Peek the top element of the stack
    public T peek() {
        if (deque.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek element.");
        }
        return deque.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        // Create a stack using StackUsingArrayDeque
        StackUsingArrayDeque<Integer> myStack = new StackUsingArrayDeque<>();

        // Push elements onto the stack
        myStack.push(9);
        myStack.push(51);
        myStack.push(169);

        // Print the top element (peek)
        System.out.println("Top element: " + myStack.peek());

        // Pop an element from the stack
        int poppedElement = myStack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + myStack.isEmpty());

        // Get the size of the stack
        System.out.println("Size of the stack: " + myStack.size());
    }
}
