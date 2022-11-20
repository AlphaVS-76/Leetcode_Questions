//Question Link - https://leetcode.com/problems/next-greater-node-in-linked-list/

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
    
    public int[] nextLargerNodes(ListNode head) {
        //get len of list
        int len = lengthOfList(head);
        List<Integer> val = new ArrayList<>();
        int[] ans = new int[len];
        
        //copy values of list to val[]
        while (head != null) {
            val.add(head.val);
            head = head.next;
        }
        
        //using stack to update next greater element
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < len; ++i) {
            while (!s.isEmpty() && val.get(s.peek()) < val.get(i)) {
                ans[s.peek()] = val.get(i);
                s.pop();
            }
            
            s.add(i);
        }
        
        return ans;
    }
}
