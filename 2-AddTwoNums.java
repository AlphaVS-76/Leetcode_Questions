//Question Link - https://leetcode.com/problems/add-two-numbers/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0); 
        ListNode head = temp;
        int carry = 0; 
        
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0; 
            if(l1 != null){ 
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += carry; 
            
            // if sum becomes 2 digit, carry becomes the tens unit
            carry = sum/10;
            
            //last digit goes to the current node, remaining goes with carry
            ListNode node = new ListNode(sum%10);
            
            head.next = node; 
            head = head.next; 
        }
        
        //head is always 0
        return temp.next;
    }
}
