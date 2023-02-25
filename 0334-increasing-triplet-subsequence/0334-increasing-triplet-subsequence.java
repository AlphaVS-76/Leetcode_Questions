class Solution {
    public boolean increasingTriplet(int[] nums) {  
        int n = nums.length;      
        //making a left min array
        int[] lm = new int[n];
        lm[0] = nums[0];

        for(int i = 1 ; i < n ; i++){
            lm[i] = Math.min(lm[i-1], nums[i]);
        }

        //making a right max array
        int[] rm = new int[n];
        rm[n-1] = nums[n-1];

        for (int i = n-2 ; i >= 0 ; i--) {
            rm[i] = Math.max(rm[i+1], nums[i]);
        }

        //compare elements from both arrays
        for(int i = 0 ; i < n ; i++){
            if(lm[i] < nums[i] && nums[i] < rm[i]){
                return true;
            }
        }

        return false;
    }
}