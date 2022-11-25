//Question Link - https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

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
    public TreeNode add(TreeNode root, int value){
        //base case
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        
        //recursive function to add new leaf nodes
        if(value < root.val){
            root.left = add(root.left, value);
        }
        if(value > root.val){
            root.right = add(root.right, value);
        }
        
        return root;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        //base case
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }
        
        TreeNode root = new TreeNode(preorder[0]);
        
        for(int i = 1 ; i < preorder.length ; i++){
            add(root, preorder[i]);
        }
        
        return root;
    }
}
