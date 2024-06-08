package Deque_using_two_FIFO_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class DequeUsingTwoQueues<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;

    public DequeUsingTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Add element to the front of the deque
    public void addFront(T element) {
        queue1.offer(element);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
        // Swap the queues
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Add element to the rear of the deque
    public void addRear(T element) {
        queue2.offer(element);
    }

    // Remove element from the front of the deque
    public T removeFront() {
        if (queue2.isEmpty()) {
            throw new IllegalStateException("Deque is empty. Cannot remove element.");
        }
        return queue2.poll();
    }

    // Remove element from the rear of the deque
    public T removeRear() {
        if (queue2.isEmpty()) {
            throw new IllegalStateException("Deque is empty. Cannot remove element.");
        }
        while (queue2.size() > 1) {
            queue1.offer(queue2.poll());
        }
        T element = queue2.poll();
        // Swap the queues
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return element;
    }

    // Peek the front element of the deque
    public T peekFront() {
        if (queue2.isEmpty()) {
            throw new IllegalStateException("Deque is empty. Cannot peek element.");
        }
        return queue2.peek();
    }

    // Peek the rear element of the deque
    public T peekRear() {
        if (queue2.isEmpty()) {
            throw new IllegalStateException("Deque is empty. Cannot peek element.");
        }
        T rearElement = null;
        for (T element : queue2) {
            rearElement = element;
        }
        return rearElement;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return queue2.isEmpty();
    }

    // Get the size of the deque
    public int size() {
        return queue2.size();
    }

    public static void main(String[] args) {
        DequeUsingTwoQueues<Integer> myDeque = new DequeUsingTwoQueues<>();

        myDeque.addFront(771);
        myDeque.addRear(18);
        myDeque.addFront(301);

        System.out.println("Front element: " + myDeque.peekFront());
        System.out.println("Rear element: " + myDeque.peekRear());

        System.out.println("Removed front element: " + myDeque.removeFront());
        System.out.println("Removed rear element: " + myDeque.removeRear());

        System.out.println("Is the deque empty? " + myDeque.isEmpty());
        System.out.println("Size of the deque: " + myDeque.size());
    }
}
