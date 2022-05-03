//Question Link - https://leetcode.com/problems/shortest-unsorted-continuous-subarray/

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        //base case
        if(nums.length <= 1){
            return 0;
        }
        
        int left = -1;
        int right = -1;
        int max = nums[0];
        int min = nums[nums.length - 1];
        
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i], b = nums[nums.length - i - 1];
            
            if (a < max){ 
                right = i;
            }
            else{
                max = a;
            }
            
            if (b > min){
                left = i;
            }
            else{
                min = b;
            }
        }
        
        return Math.max(0, left + right -(nums.length - 1) + 1);
    }
}
