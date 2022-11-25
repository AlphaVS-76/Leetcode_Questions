//Question Link - https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/

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
    
    //using depth to keep track of grandchildren
    public void add(TreeNode root, int depth){
        //base case
        if(root == null){
            return;
        }
        //if we reach the grandchildren, we add
        if(depth == 0 && root != null){
            sum += root.val;
        }
        
        add(root.left, depth-1);
        add(root.right, depth-1);
    }
    
    public void check(TreeNode root){
        //base case
        if(root == null){
            return;
        }
        
        if(root.val%2 == 0){
            add(root, 2);
        }
        
        check(root.left);
        check(root.right);
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        check(root);
        return sum;
    }
}
