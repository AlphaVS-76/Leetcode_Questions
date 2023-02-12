class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long answer = 0;

        for (int i = 0; i < nums.length; i++) {
            //binary search for the range
            int left = leftIndex(nums, i+1, lower-nums[i]);
            int right = rightIndex(nums, i+1, upper-nums[i]);
            
            answer += right - left;
        }
        
        return answer;
    }

    public int leftIndex(int[] arr, int start, int target) {
        int left = start;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right-left) / 2;
            
            if (arr[mid] >= target) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }

    public int rightIndex(int[] arr, int start, int target) {
        int left = start;
        int right = arr.length;
        
        while (left < right) {
            int mid = left + (right-left) / 2;
            
            if (arr[mid] > target) {
                right = mid;
            } 
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}