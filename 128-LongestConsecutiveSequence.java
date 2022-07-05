//Question Link - https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        Arrays.sort(nums);

        int longest = 1;
        int curr = 1;

        //checking if neighbouring elements are consecutive
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1] + 1) {
                    curr++;
                }
                else {
                    longest = Math.max(longest, curr);
                    curr = 1;
                }
            }
        }

        return Math.max(longest, curr);
    }
}
