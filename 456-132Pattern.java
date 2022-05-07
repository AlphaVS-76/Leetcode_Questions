//Question Link - https://leetcode.com/problems/132-pattern/


class Solution {
    public boolean find132pattern(int[] nums) {
        //base case
        if(nums.length <= 2){
            return false;
        }
        
        //only considering i and k cases
        int first = nums.length;
        int k = Integer.MIN_VALUE;

        for (int i = nums.length-1 ; i >= 0 ; i--) {
            if (nums[i] < k){
                return true;
            }
            //while loop runs only till the extreme cases(i & k) are valid
            while (first < nums.length && nums[i] > nums[first]){
                k = nums[first];
                first++;
            }
            
            first--;
            nums[first] = nums[i];
        }
    
        return false;
    }
}
