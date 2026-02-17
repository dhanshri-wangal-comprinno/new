//Delete the middle element from the linked List.
//leetcode : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/post-solution/?submissionId=1893266810

class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null){
            return null;
        }
        ListNode slow =head;
        ListNode fast = head;

        while(fast.next.next!= null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }

        slow.next = slow.next.next;
        return head;
        
    }
}