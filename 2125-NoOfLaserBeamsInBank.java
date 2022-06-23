//Question Link - https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

class Solution {
    public int numberOfBeams(String[] bank) {
        int o = 0; 
        int res = 0;
        
        for(String s: bank){
            int c = 0;
            //count the numbers of 1 in each string
            for(char ch: s.toCharArray()){
                if(ch == '1'){
                    c++;
				}
            }
            
            if(c > 0){
                res += (c * o);
                o = c;
            }
        }
        
        return res;
    }
}
