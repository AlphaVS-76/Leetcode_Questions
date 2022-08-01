//Question Link - https://leetcode.com/problems/sum-of-digits-in-base-k/

class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        
        for (; n != 0; n /= k){
            sum += n % k;
        }
        
        return sum;
    }
}
