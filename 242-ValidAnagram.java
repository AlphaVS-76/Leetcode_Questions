//Question Link - https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        //turn them into arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        //sort them
        Arrays.sort(a);
        Arrays.sort(b);
        
        //if they are equal, return true
        return Arrays.equals(a, b);
    }
}
