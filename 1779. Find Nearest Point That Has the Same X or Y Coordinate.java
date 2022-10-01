class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE ;
        int ans = -1;
        for(int i=0;i<points.length;i++){
                if(x == points[i][0] || y == points[i][1]){
                    int d = (int)Math.abs(x-points[i][0])+(int)Math.abs(y-points[i][1]);
                    if(d<min){
                        min  = d;
                        ans = i;
                    }
            }
        }
        return ans;
    }
}
