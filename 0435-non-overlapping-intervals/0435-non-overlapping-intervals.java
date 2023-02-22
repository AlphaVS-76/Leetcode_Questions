class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        int[] curr = new int[2];
        Arrays.sort(in, (a,b) -> a[0]-b[0]);
        int count = 0;
        
        curr[0] = in[0][0];
        curr[1] = in[0][1];

        for(int i=1 ; i<in.length ; i++){
            if(curr[1] > in[i][0]){
                curr[1] = Math.min(curr[1], in[i][1]);
                count++;
            }
            else{
                curr[0] = in[i][0];
                curr[1] = in[i][1];
            }
        }

        return count;
    }
}