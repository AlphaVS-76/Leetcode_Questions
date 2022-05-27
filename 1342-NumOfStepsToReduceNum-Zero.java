//Question Link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        //base case
        if(num == 0){
            return 0;
        }
        
        //if the number is even, half it until it becomes 0
        if(num % 2 == 0){
            return 1 + numberOfSteps(num/2);
        }
        //if num is odd, make it even and pass it through recursion
        else{
            return 1 + numberOfSteps(num-1);
        }
    }
}
