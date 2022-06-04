//Question Link - https://leetcode.com/problems/airplane-seat-assignment-probability/

class Solution {
    public double nthPersonGetsNthSeat(int n) {
        //base case
        if(n == 1){
            return (double)(n);
        }
        //everything other than 1 has a probability of 0.5
        else{
            return 0.50000;
        }
    }
}
