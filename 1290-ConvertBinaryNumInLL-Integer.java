//Question Link - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

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
    public int getDecimalValue(ListNode head) {
        //base case
        if(head.next == null){
            return head.val;
        }
        
        int ans = 0;
        ListNode temp = head;
        
        //using left shift operator because we cannot traverse singly LL in reverse
        while(temp != null){
            //the answer doubles and adds the temp.val until last node is reached
            //the binary value is automatically converted to decimal
            ans = (ans << 1) + temp.val;
            temp = temp.next;
        }
        
        return ans;
    }
}
