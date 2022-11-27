//Question Link - https://leetcode.com/problems/binary-tree-pruning/

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
    public TreeNode pruneTree(TreeNode root) {
        //base case
        if(root == null) {
            return null;
        }
        
        //checking if leaf nodes are 0 or not
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        
        //if a leaf is 0, delete it
        if(root.left == null && root.right == null && root.val==0) {
            return null;
        }
        
        return root;
    }
}
