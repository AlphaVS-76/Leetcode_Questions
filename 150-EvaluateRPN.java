//Question Link - https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

class Solution {
    boolean isOp(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(String t : tokens){
            if(!isOp(t)){
                stack.add(t);
            }
            else{
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                int ans = 0;
                
                if(t.equals("+")){
                    ans = n1 + n2;
                }
                else if(t.equals("-")){
                    ans = n2 - n1; 
                }
                else if(t.equals("*")){
                    ans = n1 * n2;
                }
                else{
                    ans = n2 / n1;
                }

                stack.add(String.valueOf(ans));
            }
        }

        return Integer.parseInt(stack.pop());  
    }
}
