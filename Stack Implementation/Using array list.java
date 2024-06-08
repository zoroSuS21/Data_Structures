package Stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList<T> {
    private List<T> list;

    public StackUsingArrayList() {
        list = new ArrayList<>();
    }

    // Push element onto the stack
    public void push(T element) {
        list.add(element);
    }

    // Pop element from the stack
    public T pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop element.");
        }
        return list.remove(list.size() - 1);
    }

    // Peek the top element of the stack
    public T peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek element.");
        }
        return list.get(list.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        // Create a stack using StackUsingArrayList
        StackUsingArrayList<Integer> myStack = new StackUsingArrayList<>();

        // Push elements onto the stack
        myStack.push(60);
        myStack.push(180);
        myStack.push(11);

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
