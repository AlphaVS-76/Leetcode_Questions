/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int depth(Node root){
        if(root==null){
            return 0;
        }

        //in the case, if there is only one node || leaf node 
        int max = 1;

        for(Node x: root.children){
            int d = 1 + depth(x);
            max = Math.max(max, d);
        }

        return max;
    }

    public int maxDepth(Node root) {
        return depth(root);
    }
}