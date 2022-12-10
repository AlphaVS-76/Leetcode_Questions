//Question Link - https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    int count = 0;
    public void countGood(TreeNode root){
        //base case
        if(root == null){
            return;
        }

        max = Math.max(max, root.val);
        int temp = max;
        //compare if node is greater/equal to highest value found
        if(max <= root.val){
            count++;
        }

        countGood(root.left);
        //restoring the max for backtracking
        max = temp;
        countGood(root.right);
    }

    public int goodNodes(TreeNode root) {
        //base case
        if(root.left == null && root.right == null){
            return 1;
        }

        countGood(root);

        return count;
    }
}
