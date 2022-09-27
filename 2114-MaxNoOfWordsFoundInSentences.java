//Question Link - https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        
        for(String a : sentences){
            String[] arr = a.split(" ");
            //only updating count of the length of the new array is bigger(max no of words)
            count = Math.max(count, arr.length);
        }
        
        return count;
    }
}
