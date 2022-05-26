//Question Link - https://leetcode.com/problems/number-of-1-bits/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //base case
        if(n == 0 || n == 1){
            return n;
        }
        //in-built function for counting '1'
        return Integer.bitCount(n);
    }
}
