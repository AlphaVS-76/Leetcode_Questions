//Question Link - https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        //approach : we are taking the middle node and from it, reversing the list
        //if it is a palindrome, reverse(mid) == head
        ListNode mid = middle(head);
        ListNode revList = reverse(mid);
        
        //if any element is different, loop breaks and head/revList != null
        while(head != null && revList != null){
            if(head.val != revList.val){
                break;
            }
            
            head = head.next;
            revList = revList.next;
        }
        
        reverse(revList);
        //if the loop has finished without breaking, it is a palindrome
        if(head == null || revList == null){
            return true;
        }
        return false;
    }
    
    public ListNode reverse(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            
            if(next!=null){
                next = next.next;
            }
        }
        
        head = prev;
        return head;
    }
    
    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}
