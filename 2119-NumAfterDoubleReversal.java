//Question Link - https://leetcode.com/problems/a-number-after-a-double-reversal/

class Solution {
    public boolean isSameAfterReversals(int num) {
        //base case
        if(num >= 0 && num <= 9){
            return true;
        }
        
        //reversing num 
        int rev1 = 0;
        int temp1 = num;
        while(temp1 != 0){
            rev1 = rev1*10 + temp1%10;
            temp1 /= 10;
        }
        
        //re-reversing num
        int rev2 = 0;
        int temp2 = rev1;
        
        while(temp2 != 0){
            rev2 = rev2*10 + temp2%10;
            temp2 /= 10;
        }
        
        //comparing both numbers
        if(rev2 == num){
            return true;
        }
        
        return false;
    }
}
