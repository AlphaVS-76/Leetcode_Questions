//Question Link - https://leetcode.com/problems/search-in-a-binary-search-tree/

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
    public TreeNode searchBST(TreeNode root, int val) {
        //base case
        if(root == null || root.val == val){
            return root;
        }
        
        //if target is in left subtree
        if(root.val > val){
            return searchBST(root.left, val);
        }
        
        //if target is in right subtree
        return searchBST(root.right, val);
    }
}
