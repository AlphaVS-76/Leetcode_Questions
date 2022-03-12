//Question Link - https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode();
        ListNode tail = merged;
        
        while(list1 != null && list2 !=  null){
            if(list1.val < list2.val){
                tail.next = list1;
                
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                
                list2 = list2.next;
                tail = tail.next;
            }
        }
        
        //comes to this statement only when one of the nodes are completely traversed
        if(list1 != null)
            tail.next = list1;
        else
            tail.next = list2;
        
        return merged.next;
    }
}
