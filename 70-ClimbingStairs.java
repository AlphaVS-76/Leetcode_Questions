//Question Link - https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        //base case
        if(n <= 2){
            return n;
        }
        //approach: fibonacci technique
        //reason: stairs more than 2 follow the fibonacci pattern for no. of ways
        int[] mem = new int[n];
        
        mem[0] = 1;
        mem[1] = 2;
        
        for(int i = 2; i < n; i++){
            mem[i] = mem[i-1] + mem[i-2];
        }
        
        //last element contains largest number of distinct ways
        return mem[n-1];
    }
}
