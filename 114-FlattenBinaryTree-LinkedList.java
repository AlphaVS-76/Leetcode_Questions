//Question Link - https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

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
    public void flatten(TreeNode root) {
        //base case
        if(root == null){
            return;
        }
        
        flatTree(root);        
    }
    
    private TreeNode flatTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        
        //preorder traversal
        TreeNode rightTree = flatTree(node.right); 
        TreeNode leftTree = flatTree(node.left);
        
        if (null != leftTree ) {
            // append right to left.
            TreeNode x = leftTree;
            
            while (x.right != null) {
                x = x.right;
            }
            
            x.right = rightTree;
            node.right = leftTree;
        }
        else {
            node.right = rightTree;
        }
        
        node.left = null;
        
        return node;
    }
}
