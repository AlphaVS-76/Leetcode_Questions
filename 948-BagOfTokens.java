//Question Link - https://leetcode.com/problems/bag-of-tokens/

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        //base case
        Arrays.sort(tokens);
        if(tokens.length == 0 || power < tokens[0]){
            return 0;
        }
        
        int score = 0;	
        int s = 0;
        int e = tokens.length-1;
        int temp = 0;
        
        //approach: 2 pointer technique
        while(s <= e){
            //applying formula to start and end simultaneously
            //to keep track of the largest score we can have
            if(tokens[s] <= power){
                temp++;
                power -= tokens[s++];
            }
            else if(tokens[e] <= power){
                temp++;
                power -= tokens[e--];
            }
            else{
                if(tokens[s] > tokens[e])
                    power += tokens[s++];
                else
                    power += tokens[e--];
                
                temp--;
            }
            
            score = Math.max(temp, score);
        }
        
        return score;
    }
}
