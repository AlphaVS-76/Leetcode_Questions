//Question Link - https://leetcode.com/problems/all-elements-in-two-binary-search-trees/

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
    List<Integer> ans = new ArrayList<>();
    public void traverse(TreeNode root){
        //base case
        if(root == null){
            return;
        }
        
        ans.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        //make a list, traverse both trees and value
        //sort it and return
        traverse(root1);
        traverse(root2);
        Collections.sort(ans);
        
        return ans;
    }
}
