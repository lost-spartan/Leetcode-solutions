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
 /*
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return null;
        ListNode curr = head;
        int length = 0;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        curr = head;
        k = length % k;
        while(k > 0){
            if(curr.next.next == null){
                curr.next.next = head;
                curr.next = null;
                k--;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}
*/
class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
    
        ListNode tmp = head;
        int cnt = 0;
        while(tmp != null){
            tmp=tmp.next;
            cnt++;
        }
        tmp=head;
        k %= cnt;
        if(k==0)return head;
        while(k-- > 0)
            tmp = tmp.next;
        ListNode tmpHead = head;
        while(tmp.next != null){
            tmp = tmp.next;
            head = head.next;
        }
        ListNode newHead = head.next;
        tmp.next = tmpHead;
        head.next = null;
        return newHead;
    }
}
