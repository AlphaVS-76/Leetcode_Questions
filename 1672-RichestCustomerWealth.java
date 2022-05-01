//Question Link - https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int customer = accounts.length;
        int bank = accounts[0].length;
        
        //make an array to store the total wealth of each customer
        int[] customerWealth = new int[customer];
        
        for(int i = 0 ; i < customer ; i++){
            int sum = 0;
            for(int j = 0 ; j < bank ; j++){
                sum += accounts[i][j];
            }
            customerWealth[i] = sum;
        }
        
        return greatest(customerWealth);
        
    }
    
    public int greatest(int[] arr){
        int great = arr[0];
        
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > great){
                great = arr[i];
            }
        }
        
        return great;
    }
}
