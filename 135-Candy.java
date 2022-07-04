//Question Link - https://leetcode.com/problems/candy/

class Solution {
    public int candy(int[] ratings) {
        //base case
        if(ratings.length == 1){
            return 1;
        }
        
        int sum = 0;
        int[] start = new int[ratings.length];
        int[] end = new int[ratings.length];
        
        Arrays.fill(start, 1);
        Arrays.fill(end, 1);
        
        //using two arrays to traverse from the start and end
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                start[i] = start[i-1] + 1;
            }
        }
        
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                end[i] = end[i+1] + 1;
            }
        }
        
        //the sum is the max at every position of the both arrays
        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(start[i], end[i]);
        }
        
        return sum;
    }
}
