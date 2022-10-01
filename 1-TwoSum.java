//Question Link - https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
          //j = i + 1 as the sum check should not be with the same elements
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }
}

//Another simple solution of this problem using python

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = 0
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in nums:
                idx = nums.index(diff)
                if i!=idx:
                    return [i,idx]
