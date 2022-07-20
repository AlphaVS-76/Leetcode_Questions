//Question Link - https://leetcode.com/problems/sort-integers-by-the-power-value/

class Solution {
    public int getKth(int lo, int hi, int k) {
        TreeMap<Integer, Stream<Integer>> powerVal = IntStream.rangeClosed(lo, hi).boxed().collect(Collectors.toMap(
                number -> pow(number),
                number -> Stream.of(number), Stream::concat, 
                () -> new TreeMap<>()
            ));
        
        return powerVal.values().stream().flatMap(stream -> stream).skip(k-1).findFirst().get();
    }
    
    private int pow(int x) {
        if(x <= 1) {
            return 0;
        }
        if(x % 2 == 0) {
            return 1 + pow(x/2);
        }
        
        return 1 + pow(3 * x + 1);
    }
}
