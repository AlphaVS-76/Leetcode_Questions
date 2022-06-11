//Question Link - https://leetcode.com/problems/check-if-it-is-a-good-array/

class Solution {
    public boolean isGoodArray(int[] nums) {
        int a = nums[0];
        
        for(int i = 1; i<nums.length ; i++){
            a = gcd(a, nums[i]);
            if(a==1){
                return true;
            }
        }
        
        return a==1;
    }
    
    //getting gcd
    public int gcd(int a, int b){
        //edge case
        if(b==0){
            return a;
        }
        if(a==0){
            return b;
        }
        
        return gcd(b, a % b);
    }
}
