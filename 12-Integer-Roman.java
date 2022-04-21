//Question Link - https://leetcode.com/problems/integer-to-roman/

class Solution {
    public String intToRoman(int num) {
        //all possibilities with the variations
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < values.length; i++) {
            //considering all the possible range for num
            while(num >= values[i]) {
                num -= values[i];
                sb.append(romanNumerals[i]);
            }
        }
    
        return sb.toString();
    }
}
