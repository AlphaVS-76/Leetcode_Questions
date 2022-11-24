//Question Link - https://leetcode.com/problems/validate-binary-search-tree/

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
    public void inorder(TreeNode root, List<Integer> result){
        //base case
        if(root == null){
            return;
        }
        
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
    
    public boolean isValidBST(TreeNode root){
        List<Integer> result = new ArrayList<>();
        //as we know, inorder traversal of BST results in a sorted array
        inorder(root, result);
        //checking if the list is sorted or not
        for(int i = 1 ; i < result.size() ; i++){
            if(result.get(i-1) >= result.get(i)){
                return false;
            }
        }
        
        return true;
    }
}
