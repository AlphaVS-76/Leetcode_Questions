//Question Link - https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        int n = 0;
        char prev = ' ';
        for (byte i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            n += getValue(c, prev);
            prev = c;
        }
        
        return n;
    }
    
    private int getValue(char c, char prev) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return prev == 'I' ? 3 : 5;
            case 'X':
                return prev == 'I' ? 8 : 10;
            case 'L':
                return prev == 'X' ? 30 : 50;
            case 'C':
                return prev == 'X' ? 80 : 100;
            case 'D':
                return prev == 'C' ? 300 : 500;
            case 'M':
                return prev == 'C' ? 800 : 1000;
        }
        
        throw new IllegalArgumentException();
    }
}
