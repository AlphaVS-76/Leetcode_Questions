//Question Link - https://leetcode.com/problems/symmetric-tree/

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
    public boolean sym(TreeNode root1,TreeNode root2){
        //base case
        if(root1==null || root2==null){
            return root1==root2;
        }
        if(root1.val != root2.val){
            return false;
        }
        
        //checking for the children node in left and right subtree parallely
        return sym(root1.left, root2.right) && sym(root1.right, root2.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left, root.right);
    }
}
