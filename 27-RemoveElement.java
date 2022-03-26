//Question Link - https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        //putting distincts elements in-place
        int k = 0;
        //traversing the array for "val" num
        for(int i = 0 ; i < nums.length ; i++){
            //distinct elements are being switched in the array
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}
