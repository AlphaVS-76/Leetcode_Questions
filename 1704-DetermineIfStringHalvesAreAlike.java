//Question Link - https://leetcode.com/problems/determine-if-string-halves-are-alike/

class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');
        int i = 0, j = s.length()-1, a = 0, b = 0;
        
        //counting the num of vowel in 2 halves to find similarity
        while(i < j){
            if(set.contains(s.charAt(i))){
                a++;
            }
            if(set.contains(s.charAt(j))){
                b++;
            }
            
            i++;
            j--;
        }
        
        return a == b;
    }
}
