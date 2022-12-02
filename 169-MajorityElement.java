//Question Link - https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
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

        Map.Entry<Integer, Integer> max = null;
        
        //return the max value using Entry
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;
            }
        }

        return max.getKey();
    }
}
