//Question Link - https://leetcode.com/problems/balance-a-binary-search-tree/

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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        //making a sorted list of the node values
        inOrder(root, list);
        
        return bst(list, 0, list.size()-1);
    }
    
    public void inOrder(TreeNode root , ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    
    public TreeNode bst(ArrayList<Integer> list , int l , int h){
        if(l > h){
            return null;
        }
        
        int mid = (l+h)/2;
        TreeNode root = new TreeNode(list.get(mid));
        
        root.left = bst(list, l, mid-1);
        root.right = bst(list, mid+1, h);
        
        return root;
    }
}
