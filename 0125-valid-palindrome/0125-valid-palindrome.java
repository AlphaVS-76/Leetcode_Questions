class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}