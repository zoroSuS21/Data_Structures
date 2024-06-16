public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public Integer pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public Integer peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek: " + stack.peek());
        
        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Pop: " + stack.pop());
    }
}
