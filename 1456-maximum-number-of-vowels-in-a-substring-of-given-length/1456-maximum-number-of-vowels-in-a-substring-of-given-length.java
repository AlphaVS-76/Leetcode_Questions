class Solution {
    public int count(String s){
        int count = 0;

        for(int i = 0 ;i < s.length() ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count ++;
            }
        }

        return count;
    }

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public int maxVowels(String s, int k) {
        if(s.length()==k){
            return count(s);
        }

        int count = 0;

        for(int i = 0 ; i < k ; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }

        int maxc = count;

        for(int i = k ; i < s.length() ; i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }

            maxc = Math.max(maxc, count);
        }

        return maxc;
    }
}