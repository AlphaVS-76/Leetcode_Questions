//Question Link - https://leetcode.com/problems/check-if-n-and-its-double-exist/

class Solution {
    public boolean checkIfExist(int[] arr) {
        //sort the array for bin search
        Arrays.sort(arr);
        int res;

        for(int i = 0; i<arr.length; i++){
            res = bin(arr, arr[i]*2);
            
            //check first condition
            if(res != i && res != -1){
                return true;
            }
        }

        return false;
    }

    public int bin(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target)
                end = mid - 1;
            else if(arr[mid] < target)
                start = mid + 1; 
            else
                return mid;
        }

        return -1;
    }
}
