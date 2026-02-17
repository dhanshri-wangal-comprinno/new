// Problem 83: leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1892878066/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp!=null && temp.next != null){
            if(temp.next.val ==temp.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}