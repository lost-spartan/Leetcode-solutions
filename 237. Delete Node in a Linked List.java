class Solution {
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

        /*
        ListNode curr = head;
        if(head.val == node.val){
            head = head.next;
        }
        while(curr.next.next != null){
            if(curr.next.val == node.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        if(curr.next.val == node.val){
            curr.next = null;
        }
        */
    }
}
