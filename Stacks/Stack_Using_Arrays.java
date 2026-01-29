package Stacks;

public class Stack_Using_Arrays {
    int st[] = new int[5];
    int front = -1, size = 0;

    public void push(int x) {
        if (size == 5) {
            System.out.println("STACK IS FULL");
        } else {
            st[++front] = x;
            size++;
        }
    }

    public void pop() {
        if (front == -1) {
            System.out.println("Stack is empty");
        } else {
            front--;
            size--;
        }
    }

    public void peek() {
        if (front == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is " + st[front]);
        }
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Stack_Using_Arrays st = new Stack_Using_Arrays();
        st.pop();
        st.push(3);
        st.push(26);
        st.peek();
        st.push(45);
        st.push(57);
        st.push(88);
        st.push(11);

    }

}
