// Question link -> https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Memory usage: 44.3 MB
// Runtime: 1ms
// 166/166 test cases passed

//------------------------------------------------------------------------------------------------------------------------------

//   Definition for singly-linked list.
//   public class ListNode {
//      int val;
//      ListNode next;
      
//      ListNode() {
//        }
      
//         ListNode(int val){ 
//             this.val = val; 
//        }    
       
//         ListNode(int val, ListNode next) { 
//             this.val = val; 
//             this.next = next; 
//        }
//  }
 

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head == null){
            return node;
        }
        while(node.next != null){
            if(node.val == node.next.val){    //skipping the duplicate node and making it unreachable
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
}
