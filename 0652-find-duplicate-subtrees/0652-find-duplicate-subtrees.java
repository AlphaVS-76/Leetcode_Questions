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
    Set<TreeNode> set;
    Map<String, TreeNode> path;

    public String solve(TreeNode root) {
        //base case
        if(root == null) {
            return "";
        }

        //storing the stringified path of all subtrees in the map(path)
        String left = solve(root.left);
        String right = solve(root.right);
        String cur = left + " " + right + " " + root.val;
        
        //if map contains that path, add it to set for later addition
        if(path.containsKey(cur)) {
            set.add(path.get(cur));
        }
        else{
            path.put(cur, root);
        }
     
        return cur;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        this.set = new HashSet<>();
        this.path = new HashMap<>();
        List<TreeNode> ans = new LinkedList<>();

        solve(root);
        
        for(TreeNode n: set) {
            ans.add(n);
        }
     
        return ans;
    }
}