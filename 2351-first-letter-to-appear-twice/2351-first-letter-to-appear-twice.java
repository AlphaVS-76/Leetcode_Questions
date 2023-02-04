class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        char ans = s.charAt(0);

        char[] str = s.toCharArray();

        for(char c: str){
            if(set.contains(c)){
                ans = c;
                break;
            }
            else{
                set.add(c);
            }
        }

        return ans;
    }
}