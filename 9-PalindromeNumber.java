//Question Link - https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        //temp variable has the last digit of the number
        int temp = 0;
        int num = x;
        
        while(x != 0){
            temp = (temp * 10) + (x % 10);
            x /= 10;
        }
        
        //edge case testing
        if(num < 0){
            temp -= (temp*2);
        }
        
        if(num == temp){
            return true;
        }
        return false;
    }
}
