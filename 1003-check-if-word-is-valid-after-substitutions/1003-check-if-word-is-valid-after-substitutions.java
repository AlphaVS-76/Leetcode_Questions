class Solution {
    public boolean isValid(String s) {
        while(s.contains("abc")) {
            s = s.replaceFirst("abc", "");
        }

        return s.isEmpty();
    }
}