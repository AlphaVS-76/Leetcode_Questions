//Question Link - https://leetcode.com/problems/odd-even-linked-list/description/

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
    public ListNode oddEvenList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }

        //using 2 pointer technique
        ListNode o = head, temp = head.next, e =  head.next;

        while(o.next != null){
            o.next = e.next;

            //changing the order of the nodes based on even/odd index, not the value in it
            if(o.next != null){
                o = e.next;
                e.next = o.next;
                e = o.next;
            }
        }

        o.next = temp;
        return head;
    }
}
