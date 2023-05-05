class Solution {
    public boolean isWhite(char c){
        return c=='W';
    }

    public int minimumRecolors(String s, int k) {
        int count = 0;

        for(int i = 0 ; i < k ; i++){
            if(isWhite(s.charAt(i))){
                count++;
            }
        }

        int minc = count;

        for(int i = k ; i < s.length() ; i++){
            if(isWhite(s.charAt(i-k))){
                count--;
            }
            if(isWhite(s.charAt(i))){
                count++;
            }

            minc = Math.min(minc, count);
        }

        return minc;
    }
}