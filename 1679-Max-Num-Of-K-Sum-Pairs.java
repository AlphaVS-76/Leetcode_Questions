//Question Link - https://leetcode.com/problems/max-number-of-k-sum-pairs/

class Solution {
    public int maxOperations(int[] nums, int k) {    
        Arrays.sort(nums);
        int count = 0 , i = 0, j = nums.length - 1;
        
        //doing 2 pointer technique, start from beginning and end
        //check if their sum is k
        //if yes move the pointers closer and count++
        //if no, inc/dec accordingly
		
        while (i < j) {
            int sum = nums[i] + nums[j];
			
            if (sum == k) {
                count++;
                i++;
                j--;
            } 
            else if (sum < k){
                 i++;
            }
            else{
                j--;
            } 
        }
        
        return count;
    }
}
