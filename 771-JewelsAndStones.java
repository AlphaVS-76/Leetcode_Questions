//Question Link - https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> s = new HashSet<>();
        int res = 0;
        
        //converting jewel array to a set
        for(Character c : jewels.toCharArray()){
            s.add(c);
        }
        
        //if jewel set has chars of stones array, res++
        for(Character c : stones.toCharArray()){
            if(s.contains(c)){
                res++;
            }
        }
        
        return res;
    }
}
