class Solution {
    public int maximum69Number (int num) {
        String ans = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean once = true;

        for(int i = 0 ; i < ans.length() ; i++){
            if(ans.charAt(i)=='6' && once){
                sb.append('9');
                once = false;
            }
            else{
                sb.append(ans.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}