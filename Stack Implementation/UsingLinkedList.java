package Stack;

import java.util.Stack;

public class StackUsingLinkedList<T> {
	private Node<T> head;
    private int size;

    public void Stack() {
        head = null;
        size = 0;
    }

    // Node class to store data and reference to next node
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    // Push operation 
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Pop operation 
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Node<T> temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    // Peek operation 
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the stack
    public int size() {
        return size;
    }

	 

	    public static void main(String[] args) {
	    	 // Create a stack of integers
	        Stack<Integer> myStack = new Stack<>();

	        // Push elements onto the stack
	        myStack.push(100);
	        myStack.push(200);
	        myStack.push(300);

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
	
