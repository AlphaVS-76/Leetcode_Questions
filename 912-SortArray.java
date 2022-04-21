//Question Link - https://leetcode.com/problems/sort-an-array/

class Solution {
    public int[] sortArray(int[] nums) {
        //base case
        if (nums.length == 0) { 
            return nums;
        }
        
        quicky(nums, 0, nums.length - 1);
        
        return nums;
    }
    
    private void quicky(int[] nums, int start, int end) {
        if(start >= end){
            return;
        }
        
        int pivot = nums[(start + end)/2];
        int left = start;
        int right = end;

        while (left <= right) {
            while (left <= right && nums[left] < pivot ) {
                left++;
            }
        
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            
            if(left <= right) {
                int temp;
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                left++;
                right--;
            }
        }
        
       quicky(nums, start, right);
       quicky(nums, left, end);
    }
}
