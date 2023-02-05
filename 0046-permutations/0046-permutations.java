class Solution {
    public void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void func(int index, List<List<Integer>> ans, int[] nums) {
        if(index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int val: nums){
                list.add(val);
            }

            ans.add(list);

            return;
        }

        for(int i=index; i<nums.length; i++) {
            swap(i, index, nums);
            func(index+1, ans, nums);
            swap(i, index, nums);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();

        func(0, ansList, nums);
        
        return ansList;
    }
}