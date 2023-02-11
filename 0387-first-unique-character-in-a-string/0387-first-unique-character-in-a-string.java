class Solution {
    public int firstUniqChar(String s) {
        //base case
        if(s.length() == 0) {
            return -1;
        }
        
        int[] a = new int[26];
        
        for(char ch : s.toCharArray()){
            a[ch-'a']++;
        }

        for(int i=0 ; i<s.length() ; i++){
            //if increased only 1 time
            if(a[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}