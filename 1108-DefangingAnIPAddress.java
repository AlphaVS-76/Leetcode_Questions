//Question Link - https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    public String defangIPaddr(String address) {
        final StringBuilder sb = new StringBuilder();
        
        for (int i = 0 ; i < address.length(); i++) {
            if (address.charAt(i) == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(address.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
