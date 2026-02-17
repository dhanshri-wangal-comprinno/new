//Problem 141: https://leetcode.com/problems/linked-list-cycle/submissions/1892002795/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode hare =head;
        ListNode turtle = head;

        while(hare != null && hare.next!= null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
}