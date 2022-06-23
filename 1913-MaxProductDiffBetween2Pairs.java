//Question Link - https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

class Solution {
    public int maxProductDifference(int[] nums) {
        //sort the array
        //best solution: max product - min product
        //last 2 elements are a,b and first 2 elements are c,d
        Arrays.sort(nums);
        int a = nums.length;
        
        return (nums[a-1]*nums[a-2])-(nums[0]*nums[1]);
    }
}
