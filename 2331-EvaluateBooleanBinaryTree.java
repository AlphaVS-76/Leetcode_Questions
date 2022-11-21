//Question Link - https://leetcode.com/problems/evaluate-boolean-binary-tree/

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
    public boolean evaluateTree(TreeNode root) {
        //base case
        if (root.left == null || root.right == null){
            return root.val == 0? false: true;
        }

        //preorder till leaf
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        //if value is 2, OR else AND
        return root.val == 2? left|right : left&right;
    }
}
