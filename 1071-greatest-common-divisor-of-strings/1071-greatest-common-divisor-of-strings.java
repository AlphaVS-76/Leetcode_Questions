class Solution {
    public int gcd(int n1, int n2){
        while(n1!=n2){  
            if(n1>n2)  
                n1=n1-n2;  
            else  
                n2=n2-n1;  
        }  

        return n2;
    }

    public String gcdOfStrings(String str1, String str2) {
        StringBuffer str = new StringBuffer("");
        //base case
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        for(int i = 0 ; i < gcd(str1.length(), str2.length()) ; i++){
            if(str1.charAt(i)==str2.charAt(i)){
                str.append(str1.charAt(i));
            }
            else{
                return "";
            }
        }

        return str.toString();
    }
}