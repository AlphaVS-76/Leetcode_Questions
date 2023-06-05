class Solution {
    public boolean checkStraightLine(int[][] c) {
        int diffx = c[1][0] - c[0][0];
        int diffy = c[1][1] - c[0][1];

        for(int i=1; i<c.length; i++){
            int x = c[i][0] - c[i-1][0];
            int y = c[i][1] - c[i-1][1];
            
            if(y * diffx != x * diffy){
                return false;
            }
        }
        
        return true;
    }
}