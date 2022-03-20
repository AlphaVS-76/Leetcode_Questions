//Question Link - https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        //recursive approach
        //base condition
        if(num/10 == 0){
            return num;
        }
        
        int temp = num;
        int sum = 0;
        
        while(num > 0){
            sum += (num%10);
            num /= 10;
        }
        
        return addDigits(sum);
    }
}
