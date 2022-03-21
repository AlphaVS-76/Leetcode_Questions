//Question Link - https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //adding the numbers from behind the array
        int first = m-1;
        int second = n-1;
        int i = (m+n)-1;
        
        while(second >= 0){
            if(first >= 0 && nums1[first] > nums2[second]){
                nums1[i] = nums1[first];
                i--;
                first--;
            } 
            else {
                nums1[i] = nums2[second];
                i--;
                second--;
            }
        }
    }
}
