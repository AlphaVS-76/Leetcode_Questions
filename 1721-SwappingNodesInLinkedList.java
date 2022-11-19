//Question Link - https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

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
    public int lengthOfList(ListNode head){
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        return len;
    }
    
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null){
            return head;
        }
        
        //get len of list
        int len = lengthOfList(head);
        
        //two pointers (start, end)
        //start = k ; end = len-k
        int start = k, end = len-k;
        
        //suppose there are 3 nodes and k=1, swapping the middle node doesnt matter so return head as is
        if(len%2 != 0 && start == end){
            return head;
        }
        
        //swap values of start and end
        ListNode first = head;
        ListNode sec = head;
        int count = 1, count1 = 0;
        
        while(count != start){
            first = first.next;
            count++;
        }
        while(count1 != end){
            sec = sec.next;
            count1++;
        }
        
        int t = first.val;
        first.val = sec.val;
        sec.val = t;
        
        return head;
    }
}
