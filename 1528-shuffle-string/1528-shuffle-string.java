class Solution {
    public String restoreString(String s, int[] indices) {
        int a;
        char[] ans = new char[s.length()];
        
        //inserting character according to indices which results in the answer string
        for(int i=0 ; i<indices.length ; i++){
            a = indices[i];
            ans[a] = s.charAt(i);
        }
        
        return new String(ans);
    }
}