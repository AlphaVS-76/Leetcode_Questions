//Question Link - https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x){
        //base case
        if(x >= 0 && x <= 9){
            return x;
        }
        
        long rev = 0;
        
        //reversing the number
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        
        //if the reverse enters the 64bit range, return 0
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)rev;
    }
}
