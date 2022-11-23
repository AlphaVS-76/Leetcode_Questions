//Question Link - https://leetcode.com/problems/sum-of-two-integers/

class Solution {
    public int getSum(int a, int b) {
        //addition using bitwise operater and left shift operator
        while(b != 0){
            int temp = ((a&b) << 1);
            a = a^b;
            b = temp;
        }
    
        return a;
    }
}
