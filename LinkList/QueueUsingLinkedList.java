public class QueueUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public QueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Integer dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public Integer peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();

        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Dequeue: " + queue.dequeue());
    }
}
