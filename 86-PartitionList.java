//Question Link - https://leetcode.com/problems/partition-list/

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
    public ListNode partition(ListNode head, int x) {
        //2 pointer technique
        ListNode b = new ListNode(0);
        ListNode before = b;
        ListNode a = new ListNode(0);
        ListNode after = a;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            }
            else {
                after.next = head;
                after = after.next;
            }
            
            head = head.next;
        }
        
        after.next = null;
        before.next = a.next;

        return b.next;
    }
}
