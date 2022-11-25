//Question Link - https://leetcode.com/problems/find-bottom-left-tree-value/

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
    int ans = 0;
    int height = 0;
    public void depthFinder(TreeNode root, int depth){
        ///base case
        if(root == null){
            return;
        }
        
        //update answer if there is a new deepest node available
        if(depth > height){
            ans = root.val;
            height++;
        }
        
        depthFinder(root.left, depth+1);
        depthFinder(root.right, depth+1);
    }
    
    public int findBottomLeftValue(TreeNode root) {
        //the deepest node value is the leftmost
        depthFinder(root, 1);
        return ans;
    }
}
