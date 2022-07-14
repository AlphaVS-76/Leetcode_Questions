//Question Link - https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        //keeping the count of i while j != its length
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                //if condition is met, index i is returned
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == haystack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
    }
}
