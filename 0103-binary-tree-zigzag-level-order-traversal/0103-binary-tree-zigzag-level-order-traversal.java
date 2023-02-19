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
    ArrayList<List<Integer>> ans;
    
    public void addToList(TreeNode node, int h) {
        if(node == null){
            return;
        }

        if(ans.size() < h+1){
            ans.add(new LinkedList<Integer>());
        }

        if(h % 2 == 0){
            ans.get(h).add(node.val);
        }
        else{
            ((LinkedList<Integer>)ans.get(h)).addFirst(node.val);
        }

        addToList(node.left, h+1);
        addToList(node.right, h+1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans = new ArrayList<List<Integer>>();
        
        addToList(root, 0);
        
        return ans;
    }
}