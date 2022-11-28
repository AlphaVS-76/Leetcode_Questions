//Question Link - https://leetcode.com/problems/invert-binary-tree/

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
    public TreeNode swap(TreeNode root) {
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        return root;
    }
    
    public TreeNode invertTree(TreeNode root) {
        //base case
        if(root == null) {
            return root;
        }

        //swap node values in preorder manner
        swap(root);
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
