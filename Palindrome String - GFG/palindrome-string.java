//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i < ch.length/2 ; i++){
            if(ch[i] != ch[ch.length-1-i]){
                char temp = ch[i];
                ch[i] = ch[ch.length-1-i];
                ch[ch.length-1-i] = temp;
            }
        }
        
        String res = new String(ch); 
        
        return res.equals(s) ? 1 : 0;
    }
};