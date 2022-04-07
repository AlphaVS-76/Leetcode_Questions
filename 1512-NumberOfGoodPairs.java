//Question Link - https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        //approach: 2 pointer which check for the specific conditions
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                //if the conditions are met, count++
                if((nums[i] == nums[j]) && (i < j)){
                    count++;
                }
            }
        }
        
        return count;
    }
}
