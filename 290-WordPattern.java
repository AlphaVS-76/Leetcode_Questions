//Question Link - https://leetcode.com/problems/word-pattern/description/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] pat = pattern.split("");
        String[] str = s.split(" ");
        //base case
        if(pat.length != str.length){
            return false;
        }

        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0 ; i<pat.length ; i++) {
            //check if key already present OR same value is already present for some other key
            if(!map.containsKey(pat[i])) {
                if(map.values().contains(str[i])) {
                    return false;
                }

                map.put(pat[i], str[i]);
            } 
            else if(!map.get(pat[i]).equals(str[i])){
                return false;
            }
        }

        return true;
    }
}
