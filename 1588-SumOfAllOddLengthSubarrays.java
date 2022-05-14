//Question Link - https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        
        //generalised formula for calculating the sum
        for (int i = 0; i < arr.length; i++){
            sum += (arr[i] * ( ( ( (i + 1)*(arr.length-i) ) +1) /2) );
        }
        
        return sum;
    }
}
