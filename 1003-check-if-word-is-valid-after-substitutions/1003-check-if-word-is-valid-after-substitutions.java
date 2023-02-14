class Solution {
    public boolean isValid(String s) {
        //base case
        if(s.length() < 3){
            return s.isEmpty();
        }
        if(s.charAt(s.length()-1)!='c'){
            return false;
        }

        if(s.contains("abc")) {
            s = s.replaceFirst("abc", "");
            return isValid(s);
        }
        else{
            return false;
        }
    }
}