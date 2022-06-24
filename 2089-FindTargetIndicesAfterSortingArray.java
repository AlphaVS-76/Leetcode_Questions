//Question Link - https://leetcode.com/problems/find-target-indices-after-sorting-array/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(nums);
        
        //just add the target indices to list if they match
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                l1.add(i);
            }
        }
        
        return l1;
    }
}
