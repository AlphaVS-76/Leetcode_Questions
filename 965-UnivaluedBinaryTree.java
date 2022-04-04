//Question Link - https://leetcode.com/problems/univalued-binary-tree/

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
    public boolean isUnivalTree(TreeNode root) {
        //base case
        if(root == null){
            return true;
        }
        
        //traversing the left child nodes
        if(root.left != null){
            if(root.left.val != root.val){
                return false;
            }
        
        }
        
        //traversing the right child nodes
        if(root.right != null){
            if(root.right.val != root.val){
                return false;
            }
        }
    
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
