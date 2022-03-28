//Question Link - https://leetcode.com/problems/reverse-nodes-in-k-group/

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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        
        //finding the length of the list
        int len = 0;
        ListNode t = head;
        while(t != null){
            len++;
            t = t.next;
        }
        int totGroups = len/k; //no of groups to be reversed

        ListNode prev = null;
        ListNode current = head;

        while(totGroups > 0){
            //these are nodes to join the reversed sublist
            ListNode last = prev;
            ListNode newEnd = current;

            //reverse the list between bounds
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null) {
                    next = next.next;
                }
            }

            if(last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;
            
            if(current == null){
                break;
            }

            prev = newEnd;
            totGroups--;
        }

        return head;
    }
}
