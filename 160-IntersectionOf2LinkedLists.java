//Question Link - https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthOfList(ListNode head){
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        return len;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;
        int len1 = lengthOfList(headA);
        int len2 = lengthOfList(headB);
        int diff = len2-len1;
        
        //if A > B, get p1 to p2s position
        if (len1 > len2) {
            for (int i = 0;i < len1 - len2; i++) {
                p1 = p1.next;
            }
        } 
        //vice versa
        else {
            for (int i=0 ; i < diff ; i++) {
                p2 = p2.next;
            }
        }
        
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
    }
}
