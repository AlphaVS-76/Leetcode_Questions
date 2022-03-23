//Question Link - https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //approach: 2 pointer method (start, end)
        if(nums.length < 2){
            //edge case
            return nums;
        }
        
        int start = 0;
        int end = nums.length-1;
        int i = 0;
        
        while(start <= end){
            //if nums[i] is even
            if(nums[i] % 2 == 0){
                nums[start] = nums[i];
                
                start++;
                i++;
            }
            //if nums[i] is even
            else{
                //if num is odd, we are swapping nums[end] element
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                
                end--;
            }
        }
        
        return nums;
    }
}
