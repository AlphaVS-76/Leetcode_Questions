//Question Link - https://leetcode.com/problems/non-decreasing-array/

class Solution {
    public boolean checkPossibility(int[] nums) {
        //base case
        int e = e(nums);
        if(e == -1){
            return true;
        }
        
        int v = nums[e];
        nums[e] = nums[e+1];
        
        if(e(nums) == -1){
            return true;
        }
        
        nums[e] = v;
        nums[e + 1] = v;
        
        if(e(nums) == -1){
            return true;
        }
        
        return false;
    }
    
    public int e(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
           if(nums[i] > nums[i + 1]) {
               return i;
           }
        }
        
        return -1;
    }
}
