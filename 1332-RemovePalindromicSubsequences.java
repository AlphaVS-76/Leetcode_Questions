//Question Link - https://leetcode.com/problems/remove-palindromic-subsequences/

class Solution {
    public boolean isPalindrome(String s){
        //checking if the string is palindrome (from the middle)
        for(int i=0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        
        return true;
    }    
    
    public int removePalindromeSub(String s) {
        //base case
        if(s.length() == 1){
            return 1;
        }
        
        return isPalindrome(s) ? 1 : 2;
    }
}
