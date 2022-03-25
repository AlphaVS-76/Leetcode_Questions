//Question Link - https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        //use 2 pointer method, one at the end, one at the start
        //get the mid of the char array
        //swap the values till mid is reached
        int j = s.length-1;
        int mid = s.length/2;
        
        for (int i=0 ; i<mid && i!=j ; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
}
