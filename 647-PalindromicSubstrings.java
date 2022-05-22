//Question Link - https://leetcode.com/problems/palindromic-substrings/

class Solution {
    public int countSubstrings(String s) {
        //base case
        if(s.length() == 1){
            return 1;
        }
        
        int count=0;
        boolean[][] dp = new boolean[s.length()][s.length()];
      
	  
	    //length == 1 -> palindrome
        for(int i=0 ; i<s.length() ; i++){
            dp[i][i] = true;
        }
        
        //for length > 1
        for(int l=2 ; l<=s.length() ; l++){
            for(int i=0 ; i<=s.length()-l ; i++){
                // finding ending index 
                int j = l+i-1;
                if(l == 2){
                    // for 2 length string we only need to check first and last character
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }
                }
                
                // check first and last character and string between them is palindrome or not
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                }
            }
        }
        
		// after all this count all true values in arr to count all palindromes
        for(int i=0 ; i<s.length() ; i++){
            for(int j=0 ; j<s.length() ; j++){
                if(dp[i][j]){
                    count++;
                }
            }
        }
        
        return count;
    }
}
