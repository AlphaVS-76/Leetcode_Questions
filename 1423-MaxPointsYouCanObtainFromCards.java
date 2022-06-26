//Question Link - https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //Approach: sliding window algorithm
        int total = 0;
        
        for (int i = 0; i < k; i++){
            total += cardPoints[i];
        }
        
        int best = total;
        
        for (int i=k-1,j=cardPoints.length-1 ; i>=0 ; i--,j--) {
            total += cardPoints[j] - cardPoints[i];
            best = Math.max(best, total);
        }
        
        return best;
    }
}
