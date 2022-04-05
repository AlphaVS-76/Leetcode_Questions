//Question Link - https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        //approach : 2 pointer method
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        
        while(start < end){
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            int area = h * w;
            
            mArea = Math.max(max, area);
            
            //reaching the middle with each iteration
            if(height[start] < height[end]){
                start++;
            }
            else if(height[start] > height[end]){
                end--;
            }
            else {
                start++;
                end--;
            }
        }
        
        return mArea;
    }
}
