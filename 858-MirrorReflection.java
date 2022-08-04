//Question Link - https://leetcode.com/problems/mirror-reflection/

class Solution {
    public int mirrorReflection(int p, int q) {
        //base case
        if(p == q){
            return 1;
        }
        
        while (p % 2 == 0 && q % 2 == 0){
            p >>= 1; q >>= 1;
        }
        
        return 1 - p%2 + q%2;
    }
}
