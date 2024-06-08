package FIFO;

import java.util.Stack;

public class FIFOQueueUsingTwoStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public FIFOQueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T element) {
        stack1.push(element);
    }

    public T dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty. Cannot dequeue element.");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new IllegalStateException("Queue is empty. Cannot peek element.");
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        FIFOQueueUsingTwoStacks<Integer> myQueue = new FIFOQueueUsingTwoStacks<>();
        myQueue.enqueue(100);
        myQueue.enqueue(200);
        myQueue.enqueue(300);

        System.out.println("Front element: " + myQueue.peek());
        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Is the queue empty? " + myQueue.isEmpty());
        System.out.println("Size of the queue: " + myQueue.size());
    }
}
