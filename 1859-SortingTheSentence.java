//Question Link - https://leetcode.com/problems/sorting-the-sentence/

class Solution {
    public String sortSentence(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];
        
        for (String w : s1) {
            int i = Character.getNumericValue(w.charAt(w.length() - 1)) - 1;
            s2[i] = w.substring(0, w.length() - 1);
        }
        
        return String.join(" ", s2);
    }
}
