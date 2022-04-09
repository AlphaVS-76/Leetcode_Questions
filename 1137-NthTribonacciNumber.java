//Question Link - https://leetcode.com/problems/n-th-tribonacci-number/

class Solution {
    //to store previous answers
    int[] arr = new int[38];
    
    Solution(){
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        //to avoid out of bound error
        for(int i = 3 ; i < arr.length ; i++){
            arr[i] = -1;
        }
    }
    
    public int tribonacci(int n) {
        //if element is already in the array, use it
        if(arr[n] != -1){
            return arr[n];
        }
        //store the resultant for later use
		else{ 
            return arr[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        }
    }
}
