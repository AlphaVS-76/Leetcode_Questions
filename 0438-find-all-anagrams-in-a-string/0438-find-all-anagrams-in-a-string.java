class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //minimum window substring
        List<Integer> ana = new ArrayList();
        //base case
        if(s == null || s.length() == 0) {
            return ana;
        }
        
        int[] temp = new int[26];
        
        for(char c: p.toCharArray()) {
            temp[c - 'a']++;
        }
        
        int start = 0, end, n = s.length(), window = p.length(), count = window;
        char c;
        
        for(end = 0; end < n; end++){
            if(end-start >= window){
                c = s.charAt(start);
                
                if(++temp[c - 'a'] > 0) {
                    count++;
                }
                
                start++;
            }
            
            c = s.charAt(end);
            
            if(--temp[c-'a'] >= 0) {
                count--;
            }
            
            if(count == 0) {
                ana.add(start);
            }
        }
        
        return ana;
    }
}