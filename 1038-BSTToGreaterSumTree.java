//Question Link - https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

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
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        //traverse till rightmost leaf
        if (root.right != null) {
            bstToGst(root.right);
        }
        
        //start getting sum from there
        sum = root.val = sum + root.val;
        
        //then backtrack till leftmost leaf
        if (root.left != null) {
            bstToGst(root.left);
        }
        
        return root;
    }
}
