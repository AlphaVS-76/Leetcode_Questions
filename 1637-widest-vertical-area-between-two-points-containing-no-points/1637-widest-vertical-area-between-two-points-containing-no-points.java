class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] i, int[] j) {
                return i[0] > j[0] ? 1 : -1;
            }
        });

        int ans = 0;

        for (int i = 1; i < points.length; i++) {
            ans = Math.max(ans, points[i][0]-points[i-1][0]);
        }

        return ans;
    }
}