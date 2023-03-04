class Solution {
    public String countAndSay(int n) {
        String s = "1";
        int x = 1;
        char[] arr = {'0','1','2','3'};

        while(x < n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for(int i=0 ; i<s.length() ; i++){
                if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                    sb.append(arr[count]);
                    sb.append(s.charAt(i));
                    count = 1;
                }
                else {
                    count++;
                }
            }

            s = sb.toString();
            x++;
        }

        return s;
    }
}