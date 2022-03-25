//Question Link - https://leetcode.com/problems/sort-list/

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
    public ListNode sortList(ListNode head) {
        //base condition
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode mid = middle(head);
        
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return merge(left, right);
    }
    
    //function for returning the middle node of a list
    public ListNode middle(ListNode head){
        ListNode s = null;
        ListNode f = head;
        
        while(f != null && f.next != null){
            s = (s == null) ? head : s.next;
            f = f.next.next;
        }
        
        ListNode mid = s.next;
        s.next = null;
        
        return mid;
    }
    
    //function for merging left and right lists
    public ListNode merge(ListNode first, ListNode second){
        ListNode temp = new ListNode();
        ListNode tail = temp;
        
        //inserting nodes in temp by comparing first/second node vals
        while(first != null && second != null){
            if(first.val < second.val){
                tail.next = first;
                first = first.next;
                tail = tail.next;
            }
            else{
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }
        
        if(first != null){
            tail.next = first;
        }
        else{
            tail.next = second;
        }
        
        return temp.next;
    }
}
