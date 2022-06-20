//Question Link - https://leetcode.com/problems/short-encoding-of-words/

class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> s1 = new HashSet(Arrays.asList(words));
        int ans = 0;
        
        //if a substr is encountered, remove it
        for (String w: words) {
            for (int k = 1 ; k < w.length() ; ++k){
                s1.remove(w.substring(k));
            }
        }
        
        //len+1 of the set would be returned
        for (String w: s1){
            ans += w.length() + 1;
        }
        
        return ans;
    }
}
