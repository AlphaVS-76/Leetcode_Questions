//Question Link - https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //creating strings for both the words
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        for (String s: word1) {
            s1.append(s);
        }
        for (String s: word2) {
            s2.append(s);
        }
        
        //comparing the words if they are equal or not
        return s1.toString().equals(s2.toString()) ? true: false;
    }
}
