public class CircularQueue {

    int[] queue = new int[5];
    int front = -1, rear = -1;

    void enqueue(int value) {
        if ((rear + 1) % 5 == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % 5;
        queue[rear] = value;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Dequeued: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % 5;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % 5;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }
}
