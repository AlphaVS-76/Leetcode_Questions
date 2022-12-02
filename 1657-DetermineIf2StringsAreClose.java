//Question Link - https://leetcode.com/problems/determine-if-two-strings-are-close/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        //base case
        if(word1.length() != word2.length()){
            return false;
        }
        
        //store all the chars in set and then store alphabet pos in array for both words
        Set<Character> s = new HashSet<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int i = 0;
        
        while(i < word1.length()){
            char one = word1.charAt(i);
            
            s.add(one);
            
            char two = word2.charAt(i);
          
            arr1[one-'a']++;
            arr2[two-'a']++;
          
            i++;
        }
        
        //if any one of the chars is not in word2. return false
        for(int j=0 ; j<word2.length() ; j++){
            if(!s.contains(word2.charAt(j))){
                return false;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //if the elements are same then the words are close
        for(int j=0 ; j<26 ; j++){
            if(!(arr1[j] == arr2[j])){
                return false;
            }
        }
        
        return true;
    }
}
