//Question Link - https://leetcode.com/problems/3sum-with-multiplicity/

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        //approach : 3 pointer method which is similar to 2 pointer method
        int[] newarr = new int[target + 1];
        int res = 0;
        int mod = 1000000007;
        
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] <= target) {
                //dividing result with mod as it can be veru large (given)
                res = (res + newarr[target - arr[i]]) % mod;
                
                for (int j = 0; j < i; j++) {
                    if (arr[i] + arr[j] <= target){
                         newarr[arr[i] + arr[j]]++;   
                    }
                }
            }
        }
        
        return res;
    }
}
