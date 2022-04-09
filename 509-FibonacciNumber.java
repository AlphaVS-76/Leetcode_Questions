//Question Link - https://leetcode.com/problems/fibonacci-number/

class Solution {
    //to store previous answers
    int[] arr = new int[31];
    public int fib(int n) {
        //approach: dynamic programming
        //base case
        if(n <= 1){
            return n;
        }
        //if element is already in the array, use it
        else if(arr[n] != 0){
            return arr[n];
        }
        //store the resultant for later use
		else{ 
            return arr[n] = fib(n-1) + fib(n-2);
        }
    }
}
