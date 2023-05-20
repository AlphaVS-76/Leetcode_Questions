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
    public int len(ListNode head){
        ListNode temp = head;
        int count = 0 ;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int[] getArray(ListNode head, int[] arr){
        ListNode temp = head;
        int i = 0;
        
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        
        return arr;
    }
    
    public ListNode insertionSortList(ListNode head) {
        int s = len(head);
        int[] arr = new int[s];

        arr = getArray(head, arr);
        Arrays.sort(arr);
        
        ListNode n = head;
        
        for(int i = 0 ; i < arr.length ; i++){
            n.val = arr[i];
            n = n.next;
        }
        
        return head;
    }
}