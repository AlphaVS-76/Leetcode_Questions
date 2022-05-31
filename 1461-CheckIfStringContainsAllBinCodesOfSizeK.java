//Question Link - https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/

class Solution {
    public boolean hasAllCodes(String s, int k) {
        //we need 2^k codes (== 1 << k)
        int need = 1 << k;
        Set<String> got = new HashSet<String>();

        for (int i=k; i<=s.length() ; i++) {
            String a = s.substring(i-k, i);
            
            //to check if the set has the substring
            if (!got.contains(a)) {
                got.add(a);
                need--;
                
                //all occurrences are found
                if (need == 0) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
