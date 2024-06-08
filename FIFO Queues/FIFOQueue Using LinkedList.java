package FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOQueueUsingLinkedList<T> {
    private Queue<T> queue;

    public FIFOQueueUsingLinkedList() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.offer(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue element.");
        }
        return queue.poll();
    }

    public T peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek element.");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        FIFOQueueUsingLinkedList<Integer> myQueue = new FIFOQueueUsingLinkedList<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println("Front element: " + myQueue.peek());
        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Is the queue empty? " + myQueue.isEmpty());
        System.out.println("Size of the queue: " + myQueue.size());
    }
}
