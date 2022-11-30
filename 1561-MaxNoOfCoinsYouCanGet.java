//Question Link - https://leetcode.com/problems/maximum-number-of-coins-you-can-get/

class Solution {
    public int maxCoins(int[] piles) {
        //base case
        if(piles.length == 3){
            Arrays.sort(piles);
            return piles[1];
        }
        
        //sort the array
        //alice picks the largest, then i pick 2nd largest, and bob picks the smallest
        //{1, 2, 3, 4, 5, 6}
        //{bob,2,3,4,me,alice}
        Arrays.sort(piles);
        
        int me = 0;     
        int alice = piles.length-1;
        int bob = piles.length/3;
		
        for(int i = alice ; i >= bob ; i--){      
            i--;
            me += piles[i];    
        }  
        
        return me;
    }
}
