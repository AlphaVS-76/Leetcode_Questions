//Question Link - https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26]; //for all possible alphabets
        int del = 0;
        int maxf = s.length();
        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        Arrays.sort(freq);
        
        for (int i = 25; i >= 0 && freq[i] > 0; i--) {
            if (freq[i] > maxf) {
                del += freq[i] - maxf;
                freq[i] = maxf;
            }
            
            maxf = Math.max(0, freq[i]-1);
        }
        
        return del;
    }
}
