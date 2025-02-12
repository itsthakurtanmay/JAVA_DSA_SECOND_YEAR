
class Node {

    int data;
    Node next;

    Node(int var1) {
        this.data = var1;
        this.next = null;
    }
}

public class insertionAtHead {

    public static Node insertAtHead(Node head, int val) {
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
        Node head = new Node(12);
        //Insertion At Head;
        head = insertAtHead(head, 11);
        head = insertAtHead(head, 10);
        head = insertAtHead(head, 9);
        head = insertAtHead(head, 8);
        head = insertAtHead(head, 7);

        traverse(head);

    }

}
