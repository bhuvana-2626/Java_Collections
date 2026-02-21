package Queues;

public class Queue_Using_Arrays {
    static int arr[];
    static int size;
    static int rear = -1;

    Queue_Using_Arrays(int n) {
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue overflow");
        } else {
            rear++;
            arr[rear] = data;
            System.out.println("Added: " + data);
        }
    }

    public int dequeue() { // we have to shift elements in dequeue operation so time complexity is O(N), so
                           // better to use CircularQueue
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int front = arr[0];
        // Shift all elements one position to the left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--; // Since one element is removed, move rear back
        return front;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[0];
    }

    public static void main(String args[]) {
        Queue_Using_Arrays q = new Queue_Using_Arrays(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element is: " + q.peek());

        System.out.println("Removed: " + q.dequeue());
        System.out.println("New Front element is: " + q.peek());
    }
}
