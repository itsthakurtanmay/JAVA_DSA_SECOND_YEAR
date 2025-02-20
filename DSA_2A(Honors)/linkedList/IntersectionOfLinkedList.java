
import java.util.HashSet;

public class IntersectionOfLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != temp2) {
            if (temp1 == null) {
                temp1 = headB;
            } else {
                temp1 = temp1.next;
            }
            if (temp2 == null) {
                temp2 = headA;
            } else {
                temp2 = temp2.next;
            }
        }
        return temp1;

    }

    //-------------Brute Force-----------------------  
    //     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     HashSet<ListNode>hs = new HashSet<>();
    //     ListNode temp = headA;
    //     while(temp != null){
    //         hs.add(temp);
    //         temp = temp.next;
    //     }
    //     temp = headB;
    //     while(temp != null){
    //         if(hs.contains(temp))return temp;
    //         temp = temp.next;
    //     }
    //     return temp;       
    // }
}
