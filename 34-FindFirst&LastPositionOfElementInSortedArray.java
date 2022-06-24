//Question link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        //2 pointer technique, 1 starts from 0 and the other nums.length-1
        int start = -1, end = -1;
        int[] res = new int[2];
        //base case
        if(nums.length == 0){
            res[0] = start;
            res[1] = end;
            return res;
        }
        
        //finding the start target
        for(int j = nums.length-1 ; j >= 0 ; j--){
            if(nums[j] == target){
                start = j;
            }
        }
        
        //finding the end target
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                end = i;
            }
        }
        
        res[0] = start;
        res[1] = end;
        return res;
    }
}
