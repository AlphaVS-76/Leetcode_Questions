//Question Link - https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        //using stack to push/pop brackets when its necessary
        Stack s1 = new Stack<>();
        String l = "([{";
        String r = ")]}";

        for (char c: s.toCharArray()) {
            if (l.indexOf(c) > -1) {
                s1.push(c);   
            } 
            else if(s1.empty() || l.indexOf((char) s1.pop()) != r.indexOf(c)) {
                return false;
            }
        }

        return s1.empty();
    }
}
