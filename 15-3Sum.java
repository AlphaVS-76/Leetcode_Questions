//Question Link - https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //base case
        if(nums.length == 0){
            return new ArrayList<>();
        }
        
        //hashset removes duplicates
        Set<List<Integer>> arr = new HashSet<>();
        
        //k starts from the end, if the sum is bigger, we decrement k
        Arrays.sort(nums);
        
        for(int i=0; i< nums.length-2; i++){
            int j = i+1;     
            int k= nums.length-1;
            
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum == 0){
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum > 0){
                    k--;    
                }
                else if(sum < 0){
                    j++;
                }
            }
        }
        
        return new ArrayList<>(arr);
    }
}
