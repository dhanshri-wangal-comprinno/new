//Problem 19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1892030370/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        int size = 0;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            size++;
        }
        if(n == size){
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
} 