//Question Link - https://leetcode.com/problems/merge-nodes-in-between-zeros/

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
    public ListNode mergeNodes(ListNode head) {
        //2 pointer technique (slow updates the head with the sum created by fast)
        ListNode slow = head;
        ListNode fast = head;
        int sum = 0;
        
        while(fast.next != null){
            sum += fast.val;
            
            if(fast.next.val == 0){
                slow.val = sum;
                
                if(fast.next.next != null){
                    slow = slow.next;
                }
                
                sum = 0;
            }
            
            fast = fast.next;
        }
        
        slow.next = null;
        
        return head;
    }
}
