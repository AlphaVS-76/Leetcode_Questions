class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] freq = new int[60];
        int m = 60;

        for(int i = 0 ; i < time.length ; i++){
            int rem = time[i] % 60;
            freq[rem]++;
        }

        //for the rest of the freq
        for(int i = 1 ; i < m/2 ; i++){
            count += freq[i] * freq[m-i];
        }

        
        //for 0, 30 rem
        count += ((long)freq[0] * (freq[0] - 1)) / 2;
        count += ((long)freq[30] * (freq[30] - 1)) / 2;

        return count;
    }
}