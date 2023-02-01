class Solution {
    public int maxRepeating(String sequence, String word) {
        //base case
        if(sequence.equals(word)){
            return 1;
        }
        
        int count = 0;
        String temp = word;

        while(sequence.contains(temp)){
            count++;
            temp += word;
        }

        return count;
    }
}