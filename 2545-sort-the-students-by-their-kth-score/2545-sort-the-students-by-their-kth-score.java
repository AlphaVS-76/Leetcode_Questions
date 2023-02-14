class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        //base case
        if(score.length == 1 && score[0].length == 1){
            return score;
        }
        
        Arrays.sort(score, new Comparator<int[]>() {
            @Override              
            public int compare(final int[] entry1, final int[] entry2) {
                return entry1[k] < entry2[k] ? 1 : -1;
            }
        });
        
        return score;
    }
}