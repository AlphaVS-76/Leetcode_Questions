//Question Link - https://leetcode.com/problems/count-operations-to-obtain-zero/

class Solution {
    public int countOperations(int num1, int num2) {
        //base case
        if(num1 == 0 || num2 == 0){
            return 0;
        }
        
        //given condition with recursive approach
        if(num1 >= num2){
            return 1 + countOperations(num1-num2, num2);
        }
        else{
            return 1 + countOperations(num1, num2-num1);
        }
    }
}
