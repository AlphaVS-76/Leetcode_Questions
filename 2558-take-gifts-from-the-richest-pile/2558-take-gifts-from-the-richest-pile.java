class Solution {
    public long findMax(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public long pickGifts(int[] gifts, int k) {
        long gift = 0;

        for(int j = 0 ; j < k ; j++){
            long max = findMax(gifts);

            for(int i = 0 ; i < gifts.length ; i++){
                if(gifts[i] == max){
                    gifts[i] = (int)Math.floor(Math.sqrt(gifts[i]));
                    break;
                }
            }
        }

        for(int i = 0 ; i < gifts.length ; i++){
            gift += gifts[i];
        }

        return gift;
    }
}