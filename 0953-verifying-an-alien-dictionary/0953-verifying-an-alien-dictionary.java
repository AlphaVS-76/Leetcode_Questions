class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] hash = new int[26];
        Arrays.fill(hash, -1);

        //updating values with their index if -1 is present
        for(int i=0 ; i<order.length() ; i++) {
            if(hash[(int)order.charAt(i) - 97] == -1) {
                hash[(int)order.charAt(i) - 97] = i;
            }
        }
        
        int flag = 0;
        
        for(int i=1 ; i<words.length ; i++) {
            flag = 0;
            
            if(words[i-1].equals(words[i])) {
                flag = 1;
                continue;
            }

            int a = words[i-1].length();
            int b = words[i].length();
            int size = a < b ? a : b;
            
            for(int j=0 ; j<size ; j++) {
                if(words[i-1].charAt(j) != words[i].charAt(j)) {
                    flag = 1;
                    
                    //false, if words[i-1]>words[i]
                    if(hash[(int)words[i-1].charAt(j)-97] > hash[(int)words[i].charAt(j)-97]) {
                        return false;
                    }

                    break;
                }
            }

            if(flag == 0 && words[i-1].length() < words[i].length()) {
                flag = 1;
            }
        }

        return flag == 1 ? true : false;
    }
}