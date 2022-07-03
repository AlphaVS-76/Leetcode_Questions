//Question Link - https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    private TreeNode helper(int[] nums, int start, int end){
          //base case
          if (start > end) {
              return null;
          }
          if (start == end) {
              return new TreeNode(nums[start]);
          }

          int mid = (start+end)/2;

          //creating a tree with the middle element as root
          TreeNode root = new TreeNode(nums[mid]);
        
          //for height balanced tree, every element on the left of middle forms the left subtree
          root.left = helper(nums, start, mid-1);
          //and every element to the right of middle forms the right subtree
          root.right = helper(nums, mid+1, end);

          return root;
    }
}
