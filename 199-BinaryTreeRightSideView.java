//Question Link - https://leetcode.com/problems/binary-tree-right-side-view/

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        //base case
        if(root == null) {
            return ans;
        }
        
        q.offer(root);
        
        while(!q.isEmpty()) {
            int count = q.size();
            
            for(int i = 0; i < count; i++) {
                TreeNode t = q.poll();
                
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null) {
                    q.offer(t.right);
                }
                
                //if its the rightmost node
                if(i == count-1) {
                    ans.add(t.val);
                }
            }
        }
        
        return ans;
    }
}
