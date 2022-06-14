//Question Link - https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/

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
    public int sum(TreeNode root){
        if(root == null)
            return 0;
        
        return sum(root.left) + sum(root.right) + root.val;
    }
    
    public int count(TreeNode root){
        if(root == null)
            return 0;
        
        return count(root.right) + count(root.left) + 1;
    }
    
    public int averageOfSubtree(TreeNode root) {
        //base case
        if(root == null)
            return 0;
        
        int count1 = 0;
        
        //comparing the avg of root and its value
        if(root.val == sum(root)/count(root))
            count1++;
        
        count1 += averageOfSubtree(root.left) + averageOfSubtree(root.right);
        
        return count1;
    }
}
