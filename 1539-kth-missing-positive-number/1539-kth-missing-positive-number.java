class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = 1;

        for(int i=0 ; i<arr.length && k>0 ; i++, n++){       
            while(arr[i]!=n && k>0){
                k--;
                n++;
            }
        }

        if(k > 0){
            return arr[arr.length-1] + k;
        }

        return n-2;
    }
}