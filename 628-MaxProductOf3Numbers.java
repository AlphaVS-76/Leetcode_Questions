//Question Link - https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        //nums is sorted now, the last three nums are biggest
        int prod = 1;
        for(int k = nums.length-1 ; k > nums.length-4 ; k--){
            prod *= nums[k];
        }
        
        //there is a chance of the array having bigger negative numbers
        int negprod = 1;
        negprod = nums[0] * nums[1] * nums[nums.length-1];
        
        if(prod > negprod){
            return prod;
        }
        return negprod;
    }
}
