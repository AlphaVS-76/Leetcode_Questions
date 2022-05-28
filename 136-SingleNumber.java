//Question Link - https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        //using xor operator: 2 same elements result in 0
        //2 diff element result in 1
        for(int i : nums) {
            result ^= i;
        }
        
        //result contains the single number
        return result;
    }
}
