class Solution {
    public List<String> par(int n, String s, int front, int back, List<String> str){ 
        //front and back are pointer index to keep track of number of brackets (<=n)
        //base case
        if(s.length() == n*2){
            str.add(s);
        }

        //check if front index is ahead or not
        if(front > back){
            if(front < n){ 
                par(n, s + "(", front+1, back, str);
            }

            par(n, s + ")", front, back+1, str);
        }
        else if(front < n){ 
            par(n, s + "(", front+1, back, str);
        }

        return str;
    }

    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();

        return par(n, "", 0, 0, str);
    }
}