//Question Link - https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode ans;

    public Solution() {
        //this stores LCA node
        this.ans = null;
    }

    private boolean rec(TreeNode curr, TreeNode p, TreeNode q) {
        //base case
        if (curr == null) {
            return false;
        }

        //dfs traversal of tree
        int left = this.rec(curr.left, p, q) ? 1 : 0;
        int right = this.rec(curr.right, p, q) ? 1 : 0;
        int mid = (curr == p || curr == q) ? 1 : 0;

        if (mid + left + right >= 2) {
            this.ans = curr;
        }

        return (mid + left + right > 0);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.rec(root, p, q);
        
        return this.ans;
    }
}
