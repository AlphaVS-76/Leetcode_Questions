//Question Link - https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        
        //base case
        if(head == null){
            return null;
        }
        while(head != null && head.val == val){
            head = head.next;
        }
        
        while(node != null && node.next != null){
            //checking if next node matches the condition
            if(node.next.val == val){
                node.next = node.next.next;
                continue;
            }
            
            node = node.next;
        }
        
        return head;
    }
}
