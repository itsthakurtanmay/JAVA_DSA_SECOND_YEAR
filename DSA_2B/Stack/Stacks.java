
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stacks {

    Node top;

    //Constructor
    public Stacks() {
        this.top = null; //stack is empty
    }

    // Push -> Similar as we done into linkedlist(Add last)
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println(x + " pushed into stack.");
    }

    // Pop (Remove last)
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow.");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next; // Top ko next node par shift kar diya
        return poppedValue;
    }

    // Peek
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element after popping: " + stack.peek());
    }
}
