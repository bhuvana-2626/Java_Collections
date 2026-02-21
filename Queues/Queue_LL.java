package Queues;

public class Queue_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // Enqueue - O(1)
    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        System.out.println("Added: " + data);
    }

    // Dequeue - O(1)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int front = head.data;

        // If there is only one node
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }

    public static void main(String args[]) {
        Queue_LL q = new Queue_LL();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }
    }
}