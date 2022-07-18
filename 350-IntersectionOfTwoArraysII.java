//Question Link - https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> arr = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();
        
        for(int i : nums1){
            if(map.containsKey(i)){
                int a = (int) map.get(i);
                map.replace(i,a+1);
            }
            else{
                map.put(i,1);
            }
        }
        
        for(int i : nums2){
            if(map.containsKey(i)){
                int a = (int) map.get(i);
                if(a==1){
                    map.remove(i);
                }
                else{
                    map.replace(i,a-1);
                }
                arr.add(i);
            }
        }
        
        int[] res = new int[arr.size()];
        
        int pointer = 0;
        
        for(int i : arr){
            res[pointer++] = i;
        }
        
        return res;
    }
}
