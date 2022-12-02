//Question Link - https://leetcode.com/problems/most-frequent-even-element/

class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        //count freq and put it as value
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        int max = -1;
        
        for(int i=0 ; i<nums.length ; i++){
            //if element is even and is greater than max, update max
            if(nums[i]%2 == 0 && map.get(nums[i]) > max){
                max = map.get(nums[i]);
            }
        }
        
        //check and return even element which is == max
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]%2 == 0 && map.get(nums[i]) == max){
                return nums[i];
            }
        }
        
        return -1;
    }
}
