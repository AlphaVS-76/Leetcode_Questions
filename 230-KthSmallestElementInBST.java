//Question Link - https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    List<Integer> arr = new ArrayList<>();
    
    public void inorder(TreeNode root){
        //base case
        if(root == null){
            return;
        }
        
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        //base case
        if(root.left == null && root.right == null && k == 1){
            return root.val;
        }
        
        inorder(root);
        
        return arr.get(k-1);
    }
}
