//Question Link - https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //using map to count the freq of each element
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        
        for (int n : arr) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        //setting the size of set to all the keys in map to see uniqueness
        HashSet<Integer> s1 = new HashSet<>(freq.values());
        
        return freq.size() == s1.size();
    }
}
