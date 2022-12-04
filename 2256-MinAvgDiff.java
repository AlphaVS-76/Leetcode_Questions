//Question Link - https://leetcode.com/problems/minimum-average-difference/

class Solution {
    public int minimumAverageDifference(int[] nums) {
        //using prefix sum
        int n = nums.length;
        long[] ps = new long[n];
        long min = Integer.MAX_VALUE;
        int x = 0;
        
        ps[0] = nums[0];
        
        for(int i = 1; i < n; i++){
            ps[i] = ps[i-1] + nums[i];
        }
        
        for(int i = 0; i < n ; i++){
            long left = ps[i] / (i+1);
            
            //if the last element avg is least
            if(i == n-1){
                if(min > left){
                    min = left;
                    x = i;
                    
                    return x;
                }
                break;
            }
            
            long right = (ps[n-1]-ps[i]) / (n-i-1);
            long diff = Math.abs(left-right);
            
            if(min > diff){
                min = diff;
                x = i;
            }
        }
        
        return x;
    }
}
