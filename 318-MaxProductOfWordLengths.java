//Question Link - https://leetcode.com/problems/maximum-product-of-word-lengths/

class Solution {
    public int maxProduct(String[] words) {
        int[] bits = new int[words.length];
        int result = 0;
    
        //converting the elements to their integer equivalent
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<words[i].length(); j++) {
                bits[i] = bits[i] | 1 << (words[i].charAt(j) - 'a');
            }
        }
        
        //checking if the elements have same characters or not
        for(int i=0; i<bits.length ; i++) {
            for(int j=i+1 ; j<bits.length ; j++) {
                if((bits[i] & bits[j]) == 0) {
                    result = Math.max(words[i].length() * words[j].length(), result);
                }
            }
        }
        
        return result;
    }
}
