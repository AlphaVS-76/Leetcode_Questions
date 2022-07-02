//Question Link - https://leetcode.com/problems/basic-calculator/submissions/

class Solution {
    public int calculate(String s) {
        //using stack to iterate through each char and operating
        Stack<Integer> stack = new Stack<Integer>();
        //base case
        if(s == null) {
            return 0;
        }
        
        int result = 0;
        int sign = 1;
        int num = 0;
        
        stack.push(sign);

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            //operand
            if(c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            } 
            //operation
            else if(c == '+' || c == '-') {
                result += sign * num;
                sign = stack.peek() * (c == '+' ? 1:-1); 
                num = 0;
            }
            //brackets
            else if(c == '(') {
                stack.push(sign);
            } 
            else if(c == ')') {
                stack.pop();
            }
        }

        result += sign * num;
        
        return result;
    }
}
