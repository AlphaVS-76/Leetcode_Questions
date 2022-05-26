//Question Link - https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {
        //base case
        if(x == y){
            return 0;
        }
        
        //using the xor and bitwise AND operator for counting the position diff.
        int temp = x^y;
        int ones = 0;
 
        while (temp > 0){
            ones += temp & 1;
            temp >>= 1;
        }
 
        return ones;
    }
}
