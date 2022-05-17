//Question Link - https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans, target;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        
        inorder(original, cloned);
        
        return ans;
    }
    
    public void inorder(TreeNode o, TreeNode c) {
        //using inorder traversal of DFS 
        if (o != null) {
            inorder(o.left, c.left);
            
            if (o == target) {
                ans = c;    
            }
            
            inorder(o.right, c.right);    
        }
    }
}
