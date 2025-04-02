public class deleteNodeArray {


    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        ListNode curr = head;
        ListNode prev = head;
        while(curr!=null){
            ListNode next = curr.next;
            if(st.contains(curr.val)){
                if(curr==head){
                    head=next;
                }
                prev.next = next;
            }else{
                prev = curr;
            }
            curr = next;
        }
        return head;
    }
}