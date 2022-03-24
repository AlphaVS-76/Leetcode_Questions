//Question Link - https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        
        boolean l = low % 2 == 0;
        boolean h = high % 2 == 0;
        
        //if both the numbers are even, odd and even nums would be equal
        if(l && h){
            return (high - low)/2;
        }
        //else, if any one of the numbers are odd, we need to count it as well with the odd half
        else{
            return ((high-low)/2) + 1;
        }
    }
}
