//Question Link - https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/description/

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
    int res = Integer.MIN_VALUE;

    public void diff(TreeNode node, int min, int max){
        //store the ancestor diff in min/max
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);

        res = Math.max(res, max-min);

        if(node.left != null) {
            diff(node.left, min, max);
        }
        if(node.right != null) {
            diff(node.right, min, max);
        }
    }

    public int maxAncestorDiff(TreeNode root) {
        diff(root, root.val, root.val);

        return res;
    }
}
