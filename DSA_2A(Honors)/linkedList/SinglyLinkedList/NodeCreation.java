
class ListNode {

    //data member;
    int data;
    ListNode next;

    //constructor;
    public ListNode(int value) {
        this.data = value;
        this.next = null;
    }
}

public class NodeCreation {

    public static void main(String[] args) {
        //Oject create;
        ListNode head = new ListNode(10);
        System.out.println(head.data);
        System.out.println(head.next);

    }
}
