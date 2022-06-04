//Question Link - https://leetcode.com/problems/divisor-game/

class Solution {
    public boolean divisorGame(int n) {
        //if its an even number, alice wins
        //if its an odd number, bob wins
        return n % 2 == 0;
    }
}
