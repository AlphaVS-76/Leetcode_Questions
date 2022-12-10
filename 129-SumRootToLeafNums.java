//Question Link - https://leetcode.com/problems/sum-root-to-leaf-numbers/description/

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
    int totNum = 0;
    public void numGen(TreeNode root){
        //when leaf node is reached, add the totnum with sum
        if(root.left == null && root.right == null){
            totNum = (totNum*10) + root.val;
            sum += totNum;
            return;
        }

        totNum = (totNum*10) + root.val;
        
        //check for skewed subtree
        if(root.left != null) {
            numGen(root.left);
            //backtracking
            totNum /= 10;
        }
        if(root.right != null){
            numGen(root.right);
            totNum /= 10;
        }
    }

    public int sumNumbers(TreeNode root) {
        //base case
        if(root.left == null && root.right == null){
            return root.val;
        }

        numGen(root);

        return sum;
    }
}
