import java.util.*;
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder("")  ;
        int n = a.length()-1;
        int m = b.length()-1;
        int carry = 0;
        int res = 0;

        while(n>=0 || m>=0 || carry == 1){
            res = carry;
            if(n >= 0) {
                res = res+a.charAt(n--)-'0';
            }
            if(m >= 0){
                res = res+b.charAt(m--)-'0';
            }

            s.append((char)(res%2+'0'));
            carry = res/2;
        }

        return s.reverse().toString();
    }
}