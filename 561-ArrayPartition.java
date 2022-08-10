//Question Link - https://leetcode.com/problems/array-partition/

class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        
        //base case
        if(nums.length == 2){
            return nums[0];
        }
        
        //sorting the array, we know the highest min values are at all the second pos from the end
        Arrays.sort(nums);
        
        for(int i = nums.length-2 ; i >= 0 ; i=i-2){
            sum += nums[i];
        }
        
        return sum;
    }
}
