//Question Link - https://leetcode.com/problems/increasing-order-search-tree/

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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList();
        
        inorder(root, vals);
        
        TreeNode ans = new TreeNode(0), cur = ans;
        
        for (int v: vals) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }
        
        return ans.right;
    }
    
    public void inorder(TreeNode node, List<Integer> vals) {
        //inorder traversal 
        if (node == null){
            return;
        }
        
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
    }
}
