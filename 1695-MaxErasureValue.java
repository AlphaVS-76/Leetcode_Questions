//Question Link - https://leetcode.com/problems/maximum-erasure-value/

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        //using 2 pointer technique
        int m = 0, score = 0;
        Set<Integer> s1 = new HashSet<>();

        for (int l=0, r=0 ; r<nums.length ; r++) {
            //loop for duplicate elements
            while (!s1.add(nums[r])) {
                score -= nums[l];
                s1.remove(nums[l]);
                l++;
            }
            //if its a distinct element
            score += nums[r];
            m = Math.max(m, score);
        }

        return m;
    }
}
