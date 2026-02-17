//Problem 142: https://leetcode.com/problems/linked-list-cycle-ii/submissions/1892144279/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode hare = head;
        ListNode turtle = head;

       
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
              
                ListNode ptr = head;
                while (ptr != turtle) {
                    ptr = ptr.next;
                    turtle = turtle.next;
                }
                return ptr; 
            }
        }

      
        return null;
    }
}