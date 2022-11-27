//Question Link - https://leetcode.com/problems/arithmetic-slices/

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int slices = 0;
	
        //every slice is of atleast 3 length
        //we add to slice if the prev 3 elements have same diff
        for (int i = 2, prev = 0; i < nums.length; i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                slices += ++prev;
            }
            else{
                slices += prev = 0;
            }
        }

        return slices;
    }
}
