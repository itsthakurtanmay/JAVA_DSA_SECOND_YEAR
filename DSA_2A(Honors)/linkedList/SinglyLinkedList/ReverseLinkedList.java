
class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode ans = reverseList(head.next);
        temp.next.next = temp;
        temp.next = null;
        return ans;
    }
}
