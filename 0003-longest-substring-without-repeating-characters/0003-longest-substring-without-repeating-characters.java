class Solution {
    public int lengthOfLongestSubstring(String s) {
        //base case
        if(s.length() <= 1) {
            return s.length();
        }
            
        Map<Character,Integer> visited = new HashMap();
        int len = 0 , current = 0;
        int start = 0 ,end = 0;

        for(int i=0 ; i<s.length() ; i++){
            char currc = s.charAt(i);
            
            if(visited.get(currc) != null && visited.get(currc) >= start){
                current = end - start;
                len = Math.max(current, len);
                    
                if(i-visited.get(currc) == 1){
                    start = i;
                } 
                else {
                    start = visited.get(currc)+1;
                }
            }

            end++;
            
            visited.put(currc, i);
        }
        
        current = end - start;
        len = Math.max(current, len);
        
        return len;
    }
}