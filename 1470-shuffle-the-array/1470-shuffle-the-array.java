class Solution {
    public int[] shuffle(int[] nums, int n) {
        //divide the array into 2
        int[] arr1 = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] arr2 = Arrays.copyOfRange(nums, nums.length/2, nums.length);

        //make another array of the original length and put el from both arrays alternatively
        int[] ans = new int[nums.length];
        int one = 0;
        int two = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(i%2==0){
                ans[i] = arr1[one++];
            }
            else{
                ans[i] = arr2[two++];
            }
        }

        return ans;
    }
}