//Question Link - https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //bfs traversal technique
		List<List<Integer>> res = new ArrayList<>();
		
        bfs(res, root, 0);
		
        return res;
	}
	
	public void bfs(List<List<Integer>> ans, TreeNode root, int h) {
		//base case
        if (root == null) {
            return;
        } 
        else {
            //if the height becomes greater, it means we have entered new level
            if(h >= ans.size()) {
                ans.add(new ArrayList<>());
            }   
            
            ans.get(h).add(root.val);
            
            bfs(ans, root.left, h+1);
            bfs(ans, root.right, h+1);
        }
	}
}
