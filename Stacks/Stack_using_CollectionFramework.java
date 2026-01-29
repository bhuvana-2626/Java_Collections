package Stacks;

import java.util.Stack;

public class Stack_using_CollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element is " + st.peek());
        System.out.println("Removing the top element i.e, " + st.pop());
        System.out.println("New top element is: " + st.peek());
        System.out.println("Is Stack empty? " + st.isEmpty());

    }

}
