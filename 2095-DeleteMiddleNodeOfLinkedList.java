//Question Link - https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode before = head;
        int counter = 0;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            counter++;
        }
        //Now, slow is the middle node of the list 
        
        //getting the node before the middle node
        for(int i = 1 ; i < counter ; i++){
            before = before.next;
        }
        
        before.next = slow.next;
        
        return head;
    }
}
