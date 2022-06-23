//Question Link - https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int a = 0;
        
        //sort both the arrays
        Arrays.sort(seats);
        Arrays.sort(students);
        
        //then for the len(seats/students) find diff
        for(int i = 0 ; i<seats.length ; i++){
            a += Math.abs(seats[i]-students[i]);
        }

        return a;
    }
}
