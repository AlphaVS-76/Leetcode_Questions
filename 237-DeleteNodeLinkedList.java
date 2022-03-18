//Question Link - https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //changing the value of node to its next node
        //then changing the node.next to node.next.next to fill in for the deleted node
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
