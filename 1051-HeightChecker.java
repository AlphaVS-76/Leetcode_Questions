//Question link - https://leetcode.com/problems/height-checker/

class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        
        //base case
        if(heights.length == 0){
            return count;
        }
        if(heights.length == 1){
            return 1;
        }
        
        //make a copy of original array
        int[] copy = new int[heights.length];
        for (int i = 0; i < heights.length; i++){
            copy[i] = heights[i];
        }
        
        //sort the copy array
        Arrays.sort(copy);
        
        //if the copy[i] != array[i] then count++
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != copy[i]){
                count++;
            }
        }
        
        return count;
    }
}
