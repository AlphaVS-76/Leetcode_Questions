//Question Link - https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

class Solution {
    public String removeDuplicates(String s) {
        int i = 0;

        while(i < s.length()-1){
            //if adjacent chars are same, we make substring of former and latter wrt the index
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.substring(0,i) + s.substring(i+2);
                i--;
            } 
            else {
                i++;
            }

            if(i < 0){
                i = 0;
            }
        }
        
        return s;
    }
}
