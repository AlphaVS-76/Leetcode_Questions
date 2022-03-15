//Question Link - https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthCycle(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;

            if(f == s) {
                //stop the fast pointer once they both reach the same node
                //temp node replaces the slow node to count the length of the cycle
                ListNode temp = s;
                int counter = 0;

                do{
                    temp = temp.next;
                    counter++;
                }while(temp != f);

                return counter;
            }
        }
        return 0;
    }
    
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        //finding the length of the cycle
        //starting from the node where f and s meet
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                length = lengthCycle(slow);
                break;
            }
        }
        //edge case
        if(length == 0){
            return null;
        }
        
        ListNode first = head;
        ListNode second = head;
        //increasing second pointer till the length of the cycle
        while(length > 0){
            second = second.next;              
            length--;
        }
            
        //increasing both the pointers till they meet each other
        while(second != first){
            second = second.next;
            first = first.next;
        }
        return second;
    }
}
