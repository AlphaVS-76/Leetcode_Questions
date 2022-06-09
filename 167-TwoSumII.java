//Question Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //using the 2 pointer technique
        int start = 0, end = numbers.length - 1;
        int[] arr = new int[2];
        
        while (numbers[start] + numbers[end] != target) {
            //move down end if sum is bigger
            if(numbers[start] + numbers[end] > target){
                end--;
            }
            //move up start if sum is smaller
            else{
                start++;
            }
        }
        
        arr[0] = start+1;
        arr[1] = end+1;
        
        return arr;
    }
}
