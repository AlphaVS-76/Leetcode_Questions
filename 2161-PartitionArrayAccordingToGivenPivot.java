class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        
        //adding all the smaller elements first
        for(int j = 0; j < n; j++){
            if(nums[j] < pivot){
                res[i++] = nums[j];
            }
        }
        
        //adding the pivot where it should be
        for(int j = 0; j < n; j++){
            if(nums[j] == pivot){
                res[i++] = pivot;
            }
        }
        
        //adding all the greater elements last
        for(int j = 0; j < n; j++){
            if(nums[j] > pivot){
                res[i++] = nums[j];
            }
        }
        
        
        return res;
    }
}
