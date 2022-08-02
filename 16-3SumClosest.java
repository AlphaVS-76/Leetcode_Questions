//Question Link - https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //base case
        if(target == 0){
            Arrays.sort(nums);
            return nums[0] + nums[1] + nums[2];
        }
        
        //two pointer approach (one at start, one at start+1 and one at end)
        int min = Integer.MAX_VALUE;
        int res = -1;
        
        Arrays.sort(nums);
        
        int n = nums.length;
        
        for(int i = 0 ; i < n-2 ; i++){
            int l = i+1;
            int r = n-1;
            
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(sum - target);
                
                if(diff < min){
                    min = diff;
                    res = sum;
                }
                
                if(sum > target){
                    r--;
                }
                else if(sum < target){
                    l++;
                }
                else{
                    return target;
                }  
            }
        }
        
        return res;
    }
}
