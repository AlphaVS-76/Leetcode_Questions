//Question Link - https://leetcode.com/problems/reveal-cards-in-increasing-order/

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[n];
        
        //queue with the index nums as elements to add/remove in res in sorted order
        for (int i=0; i<n; i++) {
            q.add(i);
        }
        
        //adding the top element, then removing second el while enqueue-ing it simultaneously
        for (int i=0; i<n; i++){
            res[q.poll()] = deck[i];
            q.add(q.poll());
        }
        
        return res;
    }
}
