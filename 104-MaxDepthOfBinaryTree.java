//Question Link - https://leetcode.com/problems/maximum-depth-of-binary-tree/

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
    int count = 0;
    public int maxDepth(TreeNode root) {
        //base case
        if(root == null){
            return 0;
        }
        
        //halving the tree and then finding the max depth
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);
        
        //returning the greater value for max depth
        return Math.max(ld, rd) + 1; 
    }
}
