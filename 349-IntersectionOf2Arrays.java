//Question Link - https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int a = nums1.length, b = nums2.length;
        Set<Integer> h1 = new HashSet<>();
        
        //base case
        if(a == 1 && b == 1 && nums1[0] == nums2[0]){
            h1.add(nums1[0]);
        }
        
        //comparing each element of nums1 and nums2
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++){
                if(nums1[i] == nums2[j]){
                    h1.add(nums1[i]);
                }
            }
        }
        
        return h1.stream().mapToInt(Integer::intValue).toArray();
    }
}
