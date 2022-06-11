//Quesiton Link - https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0], y = nums[nums.length-1], gcd = 1;  
        
        //if a number divides x and y completely, its a gcf
        for(int i = 1; i <= x && i <= y; i++) {
            if(x % i == 0 && y % i == 0){
                //store the max gcd
                gcd = i;
            }  
        }
        
        return gcd;
    }
}
