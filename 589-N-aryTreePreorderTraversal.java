//Question Link - https://leetcode.com/problems/n-ary-tree-preorder-traversal/

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
    List<Integer> l1 = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        //base case
        if (root == null){
            return l1;
        }
        
        l1.add(root.val);
        
        //adding the values while recursion
        for (Node x: root.children){
            preorder(x);
        }
        
        return l1;
    }
}
