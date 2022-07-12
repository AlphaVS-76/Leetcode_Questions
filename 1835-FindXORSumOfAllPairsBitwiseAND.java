//Question Link - https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/

class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        //using distributive property and bit manipulation method
        int xor1 = 0, xor2 = 0;
        
        for(int val: arr1) {
            xor1 ^= val;
        }
        
        for(int val: arr2) {
            xor2 ^= val;
        }
        
        return (xor1 & xor2);
    }
}
