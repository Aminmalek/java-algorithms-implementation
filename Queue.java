public class Queue {

    // Capacity of Queue
    private int capacity;
    private int arr[];
    private int front = 0;
    private int rear = 0;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];

    }

    public void enqueue(int element) {
        if (isFull() == true) {
            System.out.println("Queue Overflow");
            System.exit(0);
        }
        // Add element to first of Queue
        arr[rear] = element;
        rear += 1;
    }

    public void dequeue() {
        if (isEmpty() == true) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        arr[front] = 0;
        front += 1;

    }

    // peek item from queue whitout removing it
    public int peek() {
        int data = arr[front];
        front += 1;
        return data;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public boolean isFull() {
        return arr.length == rear;
    }

    public int getSize() {
        return capacity;
    }

    public void printQueue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " --> ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        //queue.enqueue(3);
        //queue.dequeue();
        //System.out.println(queue.peek());
        //queue.printQueue();

    }
}
