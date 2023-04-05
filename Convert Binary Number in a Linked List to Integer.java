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

// Finding the length of whole linked list and decrementig it while traversing through whole list
class Solution{
    public int getDecimalValue(ListNode head){
        int length = -1, result = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            result += curr.val * Math.pow(2,length);
            length--;
            curr = curr.next;
        }
        return result;
    }
}

// Second approch 
// Using another method for calculating decimal value 
class Solution {
    public int getDecimalValue(ListNode head) {
        int result = head.val;
        while(head.next != null){
            result = result*2 +head.next.val;
            head = head.next;
        }
        return result;
    }
}
