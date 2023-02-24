class Solution {
    public int minimumDeviation(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> e = new PriorityQueue<>(n, Collections.reverseOrder());
        int min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        
        for(int num : nums) {
            if (num % 2 == 0) {
                e.offer(num);
                min = Math.min(num, min);
            } 
            else {
                e.offer(num * 2);
                min = Math.min(num*2, min);
            }
        }
        
        while(e.peek() % 2 == 0) {
            int max = e.poll();
            res = Math.min(res, max-min);
            int newNum = max/2; 
            
            e.offer(newNum);
            
            min = Math.min(min, newNum); 
        }

        res = Math.min(e.peek() - min, res);
        
        return res;
    }
}