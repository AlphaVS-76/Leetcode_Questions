//Question Link - https://leetcode.com/problems/can-make-palindrome-from-substring/

class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> res = new ArrayList();
        
        //base case
        if (queries.length == 0){
            return res;
        }
        
        //create array of prefix counts for every next char in the string
        int[] cnt = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            int prev = (i == 0) ? 0 : cnt[i - 1];
            int idx = s.charAt(i) - 'a';
            
            cnt[i]= (prev^(1<<idx));
        }
        
        //now iterate over the query array
        for (int[] q : queries) {
            //simple case - query of 1 character is always a palindrome
            if (q[0] == q[1]) {
                res.add(true);
                continue;
            }
            
            int p = q[0] == 0 ? 0 : cnt[q[0] - 1];
            int c = (p^cnt[q[1]]);
            
            res.add((Integer.bitCount(c) / 2)<= q[2]);
        } 
        
        return res;
    }
}
