//Question Link - https://leetcode.com/problems/delete-node-in-a-bst/

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
    //getting the min value from the subtree
    public int min(TreeNode root) {        
        int temp = root.val;
            
        while(root.left!=null) {
            temp = root.left.val;
            root = root.left;
        }
            
        return temp;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        //base case
        if(root == null){
            return null;
        }
        
        //finding the position of key in BST
        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        //key == root.val
        else {
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //if its a node in between, get the least right value and delete right child
            else{
                root.val = min(root.right);
                root.right = deleteNode(root.right, root.val);
            }
            
        }  
         
        return root;
    }
}
