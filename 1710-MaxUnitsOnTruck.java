//Question Link - https://leetcode.com/problems/maximum-units-on-a-truck/

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //using greedy approach (this is similar to knapsack problem)
        int res = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            int min = Math.min(truckSize, boxTypes[i][0]);
            truckSize -= min;
            res += min * boxTypes[i][1];
        }
        
        return res;
    }
}
