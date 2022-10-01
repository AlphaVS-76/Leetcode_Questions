//Question Link - https://leetcode.com/problems/keep-multiplying-found-values-by-two/

class Solution {
    public int findFinalValue(int[] nums, int original) {
        //sort the array so that if we find original, we dont have to traverse the whole array again
        Arrays.sort(nums);
        
        //search for original
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == original){
                original *= 2;
            }
        }
        
        return original;
    }
}

// Just a recursive solution

class Solution {
    public int findFinalValue(int[] nums, int original) {
        int num = 0;
        for(int i: nums){
            if(i == original){
                num = findFinalValue(nums, original*2);
            }
        }
        if(num == 0)return original;
        return num;
    }
}
