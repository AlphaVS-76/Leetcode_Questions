//Question Link - https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0; i<nums.length-1; i++){
           if(nums[i] == nums[i+1]){
               continue;
           }
           //if elements are not same, add them to (j) index
           nums[j] = nums[i];
           j++;
        }
        //nums[nums.length-1] would not be duplicate at this point so we add it to the nums[j] element
        nums[j] = nums[nums.length-1];
        
        return j+1;
    }
}
