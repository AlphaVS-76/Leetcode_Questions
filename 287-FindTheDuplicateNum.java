//Question Link - https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        //base case
        if(nums.length <= 1){
            return -1;
        }
        
        //sort the array, then just find which consecutive element is same
        Arrays.sort(nums);
        
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        
        return -1;
    }
}
