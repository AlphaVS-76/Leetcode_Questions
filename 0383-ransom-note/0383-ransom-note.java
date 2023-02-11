class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //base case
        if(ransomNote.length() > magazine.length()) {
            return false;
        }

        char[] al = new char[26];

        for(char c : magazine.toCharArray()) {
            int i = c-'a';
            al[i]++;
        }

        for(char c : ransomNote.toCharArray()) {
            int i = c-'a';

            if (al[i] == 0) {
                return false;
            }
            
            al[i]--;
        }

        return true;
    }
}