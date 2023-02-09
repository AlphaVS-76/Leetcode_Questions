class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<Integer>[] set = new HashSet[26];
        long res = 0;

        //use array of hashsets containing the postfix of every letter
        for(int i = 0; i < 26; ++i){
            set[i] = new HashSet<>();
        }
        for(String s : ideas){
            set[s.charAt(0)-'a'].add(s.substring(1).hashCode());
        }
                
        for (int i=0 ; i<26 ; ++i){
            for (int j = i+1 ; j<26 ; ++j) {
                long c1 = 0, c2 = 0;
                for (int c : set[i]){
                    if (!set[j].contains(c)) {
                        c1++;
                    }
                }
                for (int c : set[j]){
                    if (!set[i].contains(c)) {
                        c2++;
                    }
                }

                res += c1 * c2;
            }
        }
        
        return res*2;
    }
}