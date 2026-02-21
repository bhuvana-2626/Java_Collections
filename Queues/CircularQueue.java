package Queues;

public class CircularQueue {
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;

    CircularQueue(int n) {
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Enqueue - O(1)
    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        // Adding the very first element
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
        System.out.println("Added: " + data);
    }

    // Dequeue - O(1) -> Look! No for-loop anymore!
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int result = arr[front];

        // If there was only one element left
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removed: " + q.remove()); // Removes 1
        q.add(4); // In a linear queue, this would fail. Here, it works!

        System.out.println("Front is: " + q.peek());
    }
}