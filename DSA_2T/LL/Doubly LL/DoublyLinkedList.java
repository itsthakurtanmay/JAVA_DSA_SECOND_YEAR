
class Node {

    int data;
    Node prev;
    Node next;

    //constructor
    public Node(int val) {
        this.prev = null;
        this.next = null;
        this.data = val;
    }
}

public class DoublyLinkedList {

    public static Node addFirst(Node head, int val) {
        //step1 : New node create kro;
        Node newnode = new Node(val);

        //step 2 : newnode ke next mein head daaal do;
        newnode.next = head;

        //step 3: head ke prev mein newnode daal do;
        head.prev = newnode;

        //Step 4 : update head value;
        head = newnode;

        return head;

    }

    public static void addLast(Node head, int val) {
        //step 1 : Newnode bna do;
        Node newnode = new Node(val);

        //step 2 : tail node tak traverse karo;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        //step 3: temp.next mein newnode;
        temp.next = newnode;

        //step 4: newnode ke prev mein temp daal do;
        newnode.prev = temp;

    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(12);
        // System.out.println(head.data);
        // System.out.println(head.next);
        // System.out.println(head.prev);

        head = addFirst(head, 11);
        head = addFirst(head, 10);
        head = addFirst(head, 9);
        head = addFirst(head, 9);
        head = addFirst(head, 3);
        head = addFirst(head, 1);

        traverse(head);
        System.out.println();
        addLast(head, 50);
        System.out.println("add last");
        traverse(head);
    }
}
