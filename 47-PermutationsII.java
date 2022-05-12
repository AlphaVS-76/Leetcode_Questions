//Question Link - https://leetcode.com/problems/permutations-ii/

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        //base case
        if (nums.length == 0){
            return new ArrayList<>();
        }
        Queue<List<Integer>> q = new LinkedList<>();
        //using singleton classes
        q.add(Collections.singletonList(nums[0]));
        
        for (int i = 1; i < nums.length; i++) {
            int s = q.size();
            
            while (s --> 0) {
                List<Integer> r = q.poll();
                
                for (int j = 0; j <= r.size(); j++) {
                    boolean breaker = j == r.size() || nums[i] == r.get(j);
                    List<Integer> tmp = new ArrayList<>(r);
                    
                    tmp.add(j, nums[i]);
                    q.add(tmp);
                    
                    if(breaker){
                        break;
                    }
                }
            }
        }
        
        return new ArrayList<>(q);
    }
}
