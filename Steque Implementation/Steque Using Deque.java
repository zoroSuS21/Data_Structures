package Steque;

import java.util.Deque;
import java.util.LinkedList;

public class StequeUsingDeque<T> {
    private Deque<T> deque;

    public StequeUsingDeque() {
        deque = new LinkedList<>();
    }

    public void push(T element) {
        deque.addFirst(element);
    }

    public void enqueue(T element) {
        deque.addLast(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty. Cannot pop element.");
        }
        return deque.removeFirst();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        StequeUsingDeque<Integer> steque = new StequeUsingDeque<>();
        steque.push(100);
        steque.push(200);
        steque.enqueue(300);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
