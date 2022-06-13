//Question Link - https://leetcode.com/problems/sum-of-left-leaves/

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
    
    public int sumOfLeftLeaves(TreeNode root) { 
        traverse(root, false);
        
        return sum;
    }
    
    public void traverse(TreeNode root, boolean isLeft){
        if(root == null){
            return;
        }
        
        //checking if the leaf is left leaf or right leaf
        if(root.left == null && root.right == null){
            if(isLeft){
                sum += root.val;
            }
        }
        
        traverse(root.left, true);
        traverse(root.right, false);
    }
}
