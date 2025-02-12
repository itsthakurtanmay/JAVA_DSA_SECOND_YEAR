
class Node {

    //2 member;
    int data;
    Node next;

    //constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreationOfANode {

    public static void main(String[] args) {
        //object creation of our class Node;
        Node head = new Node(12);
        System.out.println(head.data);
        System.out.println(head.next);
    }
}
