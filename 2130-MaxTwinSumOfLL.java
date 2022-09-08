//Question link - https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

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
    public int pairSum(ListNode head) {
        //find the middle, and then reversing from there
        ListNode middle = mid(head);
        ListNode second = rev(middle);
        int max = 0;
        
        while (head != null && second != null) {

            max = Math.max(head.val + second.val, max);
            head = head.next;
            second = second.next;
        }
        
        return max;
    }

    public ListNode mid(ListNode head) {
        //using running msn technique
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        
        return s;
    }

    public ListNode rev(ListNode head) {
        //iteration method
        ListNode prev = null;
        
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        
        return prev;
    }
}
