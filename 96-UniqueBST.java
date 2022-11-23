//Question Link - https://leetcode.com/problems/unique-binary-search-trees/

class Solution {
    int catalanNo(int n){
        //using catalan number to find the total possible BST
        //making an array of n+1 length as the possible number of BST comes at the n+1th position
        int[] catalan = new int[n+1];
        
        catalan[0] = catalan[1] = 1;
        
        for(int i=2 ; i < catalan.length ; i++){
            catalan[i] = 0;
            
            for(int j=0 ; j<i ; j++){
                catalan[i] += catalan[j] * catalan[i-j-1];
            }
        }
        
        return catalan[n];
    }
    
    public int numTrees(int n) {
        //base case
        if(n == 1){
            return 1;
        }
        
        return catalanNo(n);
    }
}
