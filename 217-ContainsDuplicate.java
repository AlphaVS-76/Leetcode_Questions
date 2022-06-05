//Question Link - https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        //base case
        if(nums.length == 1){
            return false;
        }
        
        //sets remove the duplicates from the given array
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        
        //if length of array > length of set means some elements did have duplicates
        return nums.length > set.size() ? true : false;
    }
}
