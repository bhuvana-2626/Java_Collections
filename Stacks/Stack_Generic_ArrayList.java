package Stacks;

import java.util.ArrayList;

/**
 * Generic Stack implementation using ArrayList.
 * Benefits: Auto-resizing, easy to implement, and Type-Safe.
 */
public class Stack_Generic_ArrayList<T> {
    // Private storage to ensure Encapsulation
    private ArrayList<T> list = new ArrayList<>();

    // PUSH: Adds an element to the top
    public void push(T x) {
        list.add(x);
        System.out.println("Pushed: " + x);
    }

    // POP: Removes and returns the top element
    // We return T so the user can actually use the data
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop from empty stack");
            return null;
        }
        return list.remove(list.size() - 1);
    }

    // PEEK: Returns the top element without removing it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.get(list.size() - 1);
    }

    // CHECK EMPTY: Returns true if stack has no elements
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // DISPLAY: Helper method to visualize the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Current Stack (Top to Bottom): ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " <- ");
        }
        System.out.println("END");
    }

    public static void main(String args[]) {
        // Example with Integers
        Stack_Generic_ArrayList<Integer> intStack = new Stack_Generic_ArrayList<>();
        System.out.println("Initial Empty Check: " + intStack.isEmpty());

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        intStack.display();
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        System.out.println("--- Testing with Strings ---");

        // Example with Strings
        Stack_Generic_ArrayList<String> StringStack = new Stack_Generic_ArrayList<>();
        StringStack.push("Bhuvana");
        StringStack.push("kruthi");
        StringStack.display();
    }
}