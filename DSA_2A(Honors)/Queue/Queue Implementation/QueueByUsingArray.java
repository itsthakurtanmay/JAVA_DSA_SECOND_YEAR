
public class QueueByUsingArray {

    int front;
    int rear;
    int size;
    int capacity;
    int[] queue;

    // Constructor 
    public QueueByUsingArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add element to the rear of the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity; // for circular queue behavior
        queue[rear] = element;
        size++;
        System.out.println(element + " enqueued to queue");
    }

    // Remove element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity; // for circular queue behavior
        size--;
        return removed;
    }

    // Get the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // Display all elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        QueueByUsingArray q = new QueueByUsingArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.display();

        q.enqueue(60);
        q.enqueue(70);

        q.display();

        System.out.println("Front element is: " + q.peek());
    }
}
