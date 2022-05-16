//Question Link - https://leetcode.com/problems/number-of-digit-one/

class Solution {
    public int countDigitOne(int n) {
        //base case
        if(n == 0){
            return 0;
        }
        if(n <= 9){
            return 1;
        }
        
        //finding the pattern for each position of where 1 can be
        int ctr = 0;
        
        for(long i = 1 ; i <= n ; i *= 10) {
            long d = i * 10;
            ctr += (n / d) * i + Math.min(Math.max(n%d-i+1, 0L), i);
        }
        
        return ctr;
    }
}
