package Stacks;

import java.util.ArrayList;

public class Stack_Generic_ArrayList<T> {
    private ArrayList<T> l = new ArrayList<>();

    public void push(T x) {
        l.add(x);
    }

    public T pop() {
        if (isempty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return l.remove(l.size() - 1);
    }

    public void peek() {
        if (l.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is" + l.get(l.size() - 1));
        }
    }

    public boolean isempty() {
        return l.isEmpty();
    }

    public static void main(String args[]) {
        Stack_Generic_ArrayList<Integer> st = new Stack_Generic_ArrayList<>();
        System.out.println("Is stack empty? " + st.isempty());
        st.push(10);
        st.push(20);
        System.out.println("Is stack empty? " + st.isempty());
        st.peek();
        st.push(40);
        st.push(60);
        System.out.println("Removing element: " + st.pop());
        st.peek();

        // like this same u can create stack of Integer/String/Float/Double..... and
        // perform any functions
        Stack_Generic_ArrayList<String> stack = new Stack_Generic_ArrayList<>();
        stack.push("Bhuvana ");

    }
}