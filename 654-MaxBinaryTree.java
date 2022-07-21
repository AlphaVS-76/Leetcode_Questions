//Question Link - https://leetcode.com/problems/maximum-binary-tree/

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        //approach: cartersian tree
        return tree(nums, 0, nums.length);
    }
    
    //to get the right suffix and left prefix
    public TreeNode tree(int[] nums, int l, int r) {
        //base case
        if (l == r){
            return null;
        }
        
        int m = max(nums, l, r);
        
        TreeNode root = new TreeNode(nums[m]);
        
        root.left = tree(nums, l, m);
        root.right = tree(nums, m+1, r);
        
        return root;
    }
    
    public int max(int[] nums, int l, int r) {
        int ans = l;
        
        for (int i = l; i < r; i++) {
            if (nums[ans] < nums[i]){
                ans = i;
            }
        }
        
        return ans;
    }
}
