package Steque;

import java.util.Stack;

public class StequeUsingTwoStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public StequeUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(T element) {
        stack1.push(element);
    }

    public void enqueue(T element) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(element);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty. Cannot pop element.");
        }
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public int size() {
        return stack1.size();
    }

    public static void main(String[] args) {
        StequeUsingTwoStacks<Integer> steque = new StequeUsingTwoStacks<>();
        steque.push(100);
        steque.push(200);
        steque.enqueue(300);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
