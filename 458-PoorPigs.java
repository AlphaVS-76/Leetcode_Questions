//Question Link - https://leetcode.com/problems/poor-pigs/

class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        //base case
        if(buckets == 1){
            return 0;
        }
        
        int trial = minutesToTest/minutesToDie;
        
        return (int)Math.ceil(Math.log(buckets) / Math.log(trial + 1));
    }
}
