package Steque;

public class StequeUsingLinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public StequeUsingLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void push(T element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void enqueue(T element) {
        Node newNode = new Node(element);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Steque is empty. Cannot pop element.");
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        StequeUsingLinkedList<Integer> steque = new StequeUsingLinkedList<>();
        steque.push(100);
        steque.push(200);
        steque.enqueue(300);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
