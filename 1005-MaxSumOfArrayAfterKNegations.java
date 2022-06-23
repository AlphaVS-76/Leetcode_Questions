//Question Link - https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int a = 0;
        
        while (k > 0) {
            //each iteration negate and multiply the smallest element
            nums[a] *= -1;
            k--;
            
            //find the new smallest number
            if (a+1 < n && nums[a] > nums[a+1]) {
                a++;
            }
        }
        
        for (int i : nums){
            sum += i;
        }
        
        return sum;
    }
}
