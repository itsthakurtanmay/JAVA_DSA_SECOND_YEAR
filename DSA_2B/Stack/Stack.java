
class Stack {

    int arr[];
    int top;
    int size;

    //Constructor
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    //Push 
    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow" + x);
            return;
        }
        arr[++top] = x;
        System.out.println(x + " pushed into stack.");
    }

    // Pop
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to pop");
            return -1;
        }
        return arr[top--];
    }

    // Peek 
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element after popping: " + stack.peek());
    }
}
