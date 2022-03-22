//Question Link - https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
        //limit - while head != null && if head == null && if head.next == null then return head
        ListNode node = head;
        
        if(node == null){
            return null;
        }
        if(node.next == null){
            return head;
        }
        while(node != null){
            if(node.next == null){
                return head;
            }
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
            
            node = node.next.next;
        }
        return head;
    }
}
