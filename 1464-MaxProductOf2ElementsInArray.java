// Question Link - https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

class Solution {
    public int maxProduct(int[] nums) {
        //Basic sorting
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 1 ; j < nums.length ; j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        //returning the product of last 2 elements
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
