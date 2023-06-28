/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = -1, i = 0;
        if(curr.next == null)
            return null;
        
        if(curr.next.next == null){
            if(n == 1){
                head.next = null;
            }else{
                head = head.next;
            }
            return head;
        }
        
        while(curr != null){
            curr = curr.next;
            length++;
        }
        curr = head;
        if(i == length-n){
            head = head.next;
        }else{
            while(i < length-n){
                curr = curr.next;
                i++;
            }
            curr.next = curr.next.next;
        }
        return head;
    }
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Two pointers - fast and slow
        ListNode slow = head;
        ListNode fast = head;
        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.next == null) {
                // If n is equal to the number of nodes, delete the head node
                if (i == n - 1) {
                    head = head.next;
                }
                return head;
            }
            fast = fast.next;
        }
        // Loop until we reach to the end.
        // Now we will move both fast and slow pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Delink the nth node from last
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
