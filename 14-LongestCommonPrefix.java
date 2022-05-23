//Question Link - https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        //base case
        if(strs.length == 0){
            return "";
        }
        
        String p = strs[0];
        
        //horizontal prefix searching
        for (int i=1 ; i < strs.length; i++){
            while (strs[i].indexOf(p) != 0) {
                p = p.substring(0, p.length() - 1);
                
                //if any element is empty, return empty
                if(p.isEmpty()) {
                    return "";
                }
            }
        }        
        
        return p;
    }
}
