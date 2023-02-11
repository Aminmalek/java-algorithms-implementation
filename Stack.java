public class Stack {

    // store elements of stack
    private int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;


    // initialize stack
    public Stack(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }


    public int push(int x) {
        if (isFull()) System.out.println("Stack OverFlow");
        top++;
        return arr[top] = x;
    }

    public int pop() {
        if (isEmpty()) System.out.println("STACK EMPTY");
        return arr[--top];

    }


    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int getSize() {
        return top + 1;
    }

    public void printStack() {
        for (int i = top ;i >=0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: ");
        stack.printStack();

        // remove element from stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();

    }
}
