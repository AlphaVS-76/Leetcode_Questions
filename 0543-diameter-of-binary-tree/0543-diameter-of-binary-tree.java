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
    int d = 0;
    public int checkDepth(TreeNode root){
        //base case
        if(root==null){
            return -1;
        }
        
        int l = checkDepth(root.left);
        int r = checkDepth(root.right);

        d = Math.max(d, l+r+2);
        
        //(+1) as leaf node == Math.max(l, r) == -1
        return 1+Math.max(l, r);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        //base case
        if(root.left == null && root.right==null){
            return 0;
        }

        checkDepth(root);

        return d;
    }
}