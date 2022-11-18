//Question Link - https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        String[] ans = new String[n];
        HashMap<Integer, String> map = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        
        //insert names in reverse order of map
        for(int i=0 ; i<n ; i++){
            ans[i] = map.get(heights[n-i-1]);  
        }
        
        return ans;
    }
}
