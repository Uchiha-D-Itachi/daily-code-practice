public class QueueArray {

    int[] queue = new int[5];
    int front = 0, rear = -1, size = 0;

    void enqueue(int value) {
        if (size == 5) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front++;
        size--;
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
