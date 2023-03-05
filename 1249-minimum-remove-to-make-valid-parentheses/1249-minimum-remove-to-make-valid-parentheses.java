class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        boolean[] valid = new boolean[s.length()];
        String ans = "";

        for(Character c: s.toCharArray()){
            if(c != '(' && c != ')'){
                valid[index] = true;
            }
            else if(c == '('){
                stack.push(index);
            }
            else{
                if(!stack.isEmpty()){
                    valid[stack.pop()] = true;
                    valid[index] = true;
                }
            }

            index++;
        }

        for(int i=0 ; i<s.length() ; i++){
            if(valid[i]){
                ans += s.charAt(i);
            }
        }
        
        return ans;
    }
}