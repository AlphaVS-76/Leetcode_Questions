//Question Link - https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){ 
                count++;
                max = Math.max(max, count);//stores the greater number
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        
        return max;
    }
}
