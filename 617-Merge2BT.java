//Question Link - https://leetcode.com/problems/merge-two-binary-trees/

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
    public TreeNode add(TreeNode r1, TreeNode r2){
        //base case
        if(r1 == null && r2 == null) {
            return null;
        }
        //if only 1 tree is there, no need to go further
        if(r1 == null && r2 != null) {
            return r2;
        }
        if(r1 != null && r2 == null) {
            return r1;
        }
    
        TreeNode ans = new TreeNode(r1.val + r2.val);

        ans.left = add(r1.left, r2.left);
        ans.right = add(r1.right, r2.right);

        return ans;
    }
    
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return add(root1, root2);
    }
}
