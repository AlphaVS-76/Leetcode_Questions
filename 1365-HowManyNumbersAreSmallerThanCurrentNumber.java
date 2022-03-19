//Question Link - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArr = new int[nums.length];
        
        //implement 2 for loops
        //define a count variable that counts if j < i
        //at the end of loop it puts 'count' in the new array
        
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            
            for(int j = 0 ; j < nums.length ; j++){
                if(j != i && nums[j] < nums[i])  {
                    count++;
                }  
            }
            newArr[i] = count;
        }
        return newArr;
    }
}
