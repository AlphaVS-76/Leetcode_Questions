// Question Link - https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //using the fast and slow pointer algorithm
        ListNode f = head;
        ListNode s = head;
       
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            //if the pointers meet again, cycle is present
            if(s == f){
                return true;
            }
        }
        return false;
    }
}
