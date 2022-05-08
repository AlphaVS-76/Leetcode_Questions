//Question Link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        //base case
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        
        //if min element is at last
        if(nums[nums.length-1] < nums[0] && nums[nums.length-1] < nums[nums.length-2]){
            return nums[nums.length-1];
        }
        //if rotation is not present, it means that min element is at first pos
        else if(nums[0] < nums[nums.length-1]){
            return nums[0];
        }
        //if rotation is present
        else if(nums[0] > nums[nums.length-1]){
            for(int i = 0 ; i < nums.length-1 ; i++){
                if(nums[i] > nums[i+1]){
                    return nums[i+1];
                }
            }   
        }
        return -1;
    }
}
