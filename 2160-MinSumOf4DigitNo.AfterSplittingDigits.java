//Question Link - https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

class Solution {
    public int minimumSum(int num) {
        //seperate the digits into an array
        //sort the array
        //return the sum of pairs
        int[] arr = {num%10, (num/10)%10, (num/100)%10, (num/1000)%10};
        
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    continue;
                }
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        int first = (arr[0]*10) + arr[1];
        int sec = (arr[2]*10) + arr[3];
        int sum = first + sec;
        
        return sum;
    }
}
