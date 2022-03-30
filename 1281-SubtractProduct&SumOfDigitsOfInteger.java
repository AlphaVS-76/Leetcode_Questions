//Question Link - https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        //answer = prod of digits - sum of digits
        int prod = 1;
        int sum = 0;
        while(n > 0){
            sum += (n % 10);
            prod *= (n % 10);
            
            n /= 10;
        }
        
        return prod-sum;
    }
}
