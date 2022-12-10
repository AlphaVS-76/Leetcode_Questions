//Question Link - https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/description/

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
    long totalSum;
    long max = 0;
    int m = 1000000007;
    public void dfs(TreeNode root) {
        //base case
        if (root == null) {
            return;
        }

        max = Math.max(max, (totalSum-root.val)*root.val);
        dfs(root.left);
        dfs(root.right);
    }

    public int getTotalSum(TreeNode root) {
        //base case
        if (root == null) {
            return 0;
        }
        
        return root.val += getTotalSum(root.left) + getTotalSum(root.right);
    }

    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        dfs(root);
        
        return (int)(max%m);
    }
}
