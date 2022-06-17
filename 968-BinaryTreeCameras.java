//Question Link - https://leetcode.com/problems/binary-tree-cameras/

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
    //using dp approach
    public int minCameraCover(TreeNode root) {
        int[] ans = solve(root);
        
        //the smaller element has the no. of min cameras
        return Math.min(ans[1], ans[2]);
    }
    
    public int[] solve(TreeNode node) {
        //base case
        if (node == null){
            return new int[]{0, 0, 99999};
        }

        int[] L = solve(node.left);
        int[] R = solve(node.right);
        
        int mL12 = Math.min(L[1], L[2]);
        int mR12 = Math.min(R[1], R[2]);

        int d0 = L[1] + R[1];
        int d1 = Math.min(L[2] + mR12, R[2] + mL12);
        int d2 = 1 + Math.min(L[0], mL12) + Math.min(R[0], mR12);
        
        return new int[]{d0, d1, d2};
    }
}
