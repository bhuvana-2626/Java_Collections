package Stacks;

public class Stack_Generic_LL<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node newNode = new Node(data);
        newNode.next = top; // Link the new node to the current top
        top = newNode; // Move top to the new node
        System.out.println("Pushed: " + data);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        T value = top.data;
        top = top.next; // Move top to the next node in the chain
        return value;
    }

    public T peek() {
        if (isEmpty())
            return null;
        return top.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack : ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack_Generic_LL<String> s = new Stack_Generic_LL<>();
        s.push("Bhuvana");
        s.push("Kruthi");
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();
    }
}