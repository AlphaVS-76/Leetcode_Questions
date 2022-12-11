//Question Link - https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

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
    int max = Integer.MIN_VALUE;
    public int getMax(TreeNode root){
        //base case
        if(root == null){
            return 0;
        }

        //check leaf nodes for max value 
        int left = getMax(root.left);
        int right = getMax(root.right);
        left = Math.max(0, left);
        right = Math.max(0, right);

        //check max for all subtrees
        max = Math.max(max, root.val + right + left);

        //lastly, consider the root node as a path
        return root.val + Math.max(left,right);
    }

    public int maxPathSum(TreeNode root) {
        int a = getMax(root);
        
        return max;
    }
}
