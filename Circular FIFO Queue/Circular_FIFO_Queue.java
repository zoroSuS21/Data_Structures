package Circular_FIFO_Queue;

public class CircularFIFOQueue<T> {
    private T[] queue;
    private int front; // Front of the queue
    private int rear; // Rear of the queue
    private int size; // Current size
    private int capacity; // Maximum capacity

    public CircularFIFOQueue(int capacity) {
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(T element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full. Cannot enqueue element.");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue element.");
        }
        T removedElement = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        return removedElement;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek element.");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CircularFIFOQueue<Integer> myQueue = new CircularFIFOQueue<>(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println("Front element: " + myQueue.peek());
        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Is the queue empty? " + myQueue.isEmpty());
        System.out.println("Size of the queue: " + myQueue.size());
    }
}
