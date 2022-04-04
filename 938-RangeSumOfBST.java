//Question Link - https://leetcode.com/problems/range-sum-of-bst/

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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        //base case
        if(root == null){
            return 0;
        }
        
        //if the value os in range, it adds into sum and traversal goes on
        if(root.val >= low && root.val <= high){
            sum += root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        //else, traversal goes on without addition
        else{
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        }
        
        return sum;
    }
}
