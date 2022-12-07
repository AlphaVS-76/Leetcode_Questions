//Question Link - https://leetcode.com/problems/minimum-area-rectangle/description/

class Solution {
    public int minAreaRect(int[][] points) {
        //base case
        if(points.length == 1){
            return 0;
        }

        Map<Integer, Set<Integer>> map = new HashMap<>();
        //Hashmaps/sets to keep track of all possible lengths of height and width
        for (int[] p : points) {
            if (!map.containsKey(p[0])) {
                map.put(p[0], new HashSet<>());
            }
            map.get(p[0]).add(p[1]);
        }

        int min = Integer.MAX_VALUE;
        
        for (int[] p1 : points) {
            for (int[] p2 : points) {
                if (p1[0] == p2[0] || p1[1] == p2[1]) {
                    continue;
                }
                //find elements of same length(same element) to get a square
                if (map.get(p1[0]).contains(p2[1]) && map.get(p2[0]).contains(p1[1])) {
                    min = Math.min(min, Math.abs(p1[0]-p2[0]) * Math.abs(p1[1]-p2[1]));
                }
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
