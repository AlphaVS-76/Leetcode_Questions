//Question Link - https://leetcode.com/problems/reverse-linked-list-ii/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        //traversing left-1 nodes so we can start reversing from next node
        ListNode prev = null;
        ListNode current = head;
        for (int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }

        //these are nodes to join the reversed sublist
        ListNode last = prev;
        ListNode newEnd = current;

        //reverse the list between bounds
        ListNode next = current.next;
        for (int i = 0; current != null && i < right-left+1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null) {
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev;
        }
        else{
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}
