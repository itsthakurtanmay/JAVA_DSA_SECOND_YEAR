
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

    public static Node insertionAtHead(Node head, int val) {
        //step 1: Create a new node
        Node newnode = new Node(val);

        //step 2 : connect newnode ko head node;
        newnode.next = head;

        //step 3: Update the new head value;
        head = newnode;

        return head;

    }

    public static void traverse(Node head) {
        //creating a temp node;
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        //object creation of our class Node;
        Node head = new Node(12);
        // System.out.println(head.data);
        // System.out.println(head.next);

        //Insertion At Head;
        head = insertionAtHead(head, 11);
        head = insertionAtHead(head, 10);
        head = insertionAtHead(head, 9);
        head = insertionAtHead(head, 8);
        head = insertionAtHead(head, 7);

        traverse(head);
    }
}
