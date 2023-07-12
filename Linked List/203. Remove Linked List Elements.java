class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head; 
        while(head != null && head.val == val){
            head = head.next;
            //  What if the second element is also val, but this time it is mot the second node
        }
        while(curr != null && curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
