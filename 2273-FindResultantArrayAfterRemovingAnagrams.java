//Question Link - https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        char[] temp = words[0].toCharArray();
        
        Arrays.sort(temp);
        
        String prev = new String(temp);
        ans.add(words[0]);
        
        for(int i=1 ; i<words.length ; i++){
            temp = words[i].toCharArray();
            
            Arrays.sort(temp);
            String curr = new String(temp);
            
            if(curr.equals(prev)){
                continue;
            }
            
            ans.add(words[i]);
            char[] tmp = words[i].toCharArray();
            
            Arrays.sort(tmp);
            
            prev = new String(tmp);
        }
        
        return ans;
    }
}
