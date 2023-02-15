class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int weight: weights){
            max = Math.max(max, weight);
            sum += weight;
        }
        
        int start = max;
        int end = sum;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isCapable(weights, days, mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;
    }

    boolean isCapable(int[] weights, int days, int mid){
        int count = 1;
        int sum = 0;
        
        for(int w: weights){
            if(sum + w > mid){
                count++;
                sum = w;
            }
            else{
                sum += w;
            }
        }

        return count <= days;
    }
}