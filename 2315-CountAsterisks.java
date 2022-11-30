//Question Link - https://leetcode.com/problems/count-asterisks/

class Solution {
    public int countAsterisks(String s) {
        int count = 0, danda = 0;
        
        for (int i=0 ; i<s.length() ; i++){
            //increase freq given that 2 dandas have passed
            if (s.charAt(i) == '*' && danda % 2 == 0){
                count++;
            }
            if(s.charAt(i)=='|'){
                danda++;
            }
        }
         
        return count;
    }
}
