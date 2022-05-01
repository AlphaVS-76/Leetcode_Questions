//Question Link - https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        return stacking(S).equals(stacking(T));
    }
    
    public String stacking(String str) {
        //using stack to keep track of '#'
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } 
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        
        return stack.toString();
    }
}
