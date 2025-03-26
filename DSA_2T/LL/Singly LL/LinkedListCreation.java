
class Node {

    int data;
    Node next;

    //constructor
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class LinkedListCreation {

    public static Node insertionAtHead(Node head, int val) {
        //step1 : New node create;
        Node newnode = new Node(val);

        //step 2 : newnode ke next mein head daal do;
        newnode.next = head;

        //step 3 : Update head;
        head = newnode;
        return head;

    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        //object creation;
        Node head = new Node(11);
        // System.out.println(head.data);
        // System.out.println(head.next);

        //add First / insert at head;
        head = insertionAtHead(head, 10);
        head = insertionAtHead(head, 9);
        head = insertionAtHead(head, 8);
        head = insertionAtHead(head, 7);
        head = insertionAtHead(head, 6);

        traverse(head);
    }
}
