//Question Link - https://leetcode.com/problems/deepest-leaves-sum/

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
    private int deepest = 0;
    private int sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        //base case
        if(root.left == null && root.right == null){
            return root.val;
        }
        
        totSum(root, 0);
        
        return sum;
    }
    
    private void totSum(TreeNode root,int level){
        //base case
        if(root == null){
            return;
        }
        
        //this indicates if the node has child or not, if it has, sum = 0
        if(level > deepest){
            sum = 0;
            deepest = level;
        }
        
        if(level == deepest)
            sum += root.val;
        
        //using preorder traversal
        totSum(root.left, level+1);
        totSum(root.right, level+1);
    }
}
