//Question Link - https://leetcode.com/problems/rotate-list/

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
    public ListNode rotateRight(ListNode head, int k) {
        //approach = thinking of it as a circular linked list, connecting/disconnecting tail when necessary
        //base case
        if(k == 0 || head == null || head.next == null){
            return head;
        }
        
        //find out the length
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }
        
        //connect temp to head (making it into a cicular list)
        temp.next = head;
        
        //how many iterations to do
        int rotations = k % len;
        int skip = len - rotations;
        
        //assigning a tail to know when to end 
        ListNode tail = head;
        
        //increase newlast 'skip-1' times
        for(int i = 0 ; i < skip-1 ; i++){
            tail = tail.next;
        }
        
        head = tail.next;
        
        //convert it back to singly linked list
        tail.next = null;
        
        return head;
    }
}
