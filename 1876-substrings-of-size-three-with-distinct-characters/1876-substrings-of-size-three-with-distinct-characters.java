class Solution {
    public boolean good(String s){
        return (s.charAt(0) != s.charAt(1)) && (s.charAt(0) != s.charAt(2)) && (s.charAt(1) != s.charAt(2));
    } 

    public int countGoodSubstrings(String s) {
        int count = 0;

        for(int i = 0 ; i <= s.length()-3 ; i++){
            if(good(s.substring(i, i+3))){
                count++;
            }
        }

        return count;
    }
}