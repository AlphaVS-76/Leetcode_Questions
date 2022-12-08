//Question Link - https://leetcode.com/problems/leaf-similar-trees/description/

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
    public void putEl(List<Integer> list, TreeNode root){
        //base case
        if(root == null){
            return;
        }
        //leaf node
        if(root.left == null && root.right == null){
            list.add(root.val);
        }

        putEl(list, root.left);
        putEl(list, root.right);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //put all leaf values in arraylist for root1 and root2
        putEl(list1, root1);
        putEl(list2, root2);

        //check if they are equal
        return list1.equals(list2);
    }
}
