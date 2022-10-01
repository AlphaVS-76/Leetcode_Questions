class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0,i,j;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && (i*j)%k==0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
