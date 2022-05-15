//Question Link - https://leetcode.com/problems/maximum-consecutive-floors-without-special-floors/

class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        //base case
        if(top == bottom){
            return 0;
        }
        
        Arrays.sort(special);
        
        //comparing if the spaces on the extreme sides of special floors are enought or not
        int ans = Math.max(special[0]-bottom , top-special[special.length-1]);
        
        for (int i = 1 ; i < special.length ; ++i){
            ans = Math.max(ans , special[i]-special[i-1]-1);
        }
        
        return ans;
    }
}
