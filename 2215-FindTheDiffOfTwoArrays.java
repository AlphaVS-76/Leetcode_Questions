//Question Link - https://leetcode.com/problems/find-the-difference-of-two-arrays/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        //put elements in sets
        for(int n1: nums1){
            s1.add(n1);
        }
        for(int n2: nums2){
            s2.add(n2);
        }
        
        //check if elements are present in the other array
        for (int n : nums1) {
            if (s2.contains(n)) {
                s1.remove(n);
                s2.remove(n);
            }
        }
        
        res.add(new ArrayList<>(s1));
        res.add(new ArrayList<>(s2));
        
        return res;
    }
}
