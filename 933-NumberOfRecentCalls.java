//Question Link - https://leetcode.com/problems/number-of-recent-calls/

class RecentCounter {
    Queue<Integer> q1 = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        //check if its empty, if it is not
        //push t and pop
        q1.add(t);
        while(!q1.isEmpty() && q1.peek() < t - 3000){
            q1.remove();
        }
        return q1.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
