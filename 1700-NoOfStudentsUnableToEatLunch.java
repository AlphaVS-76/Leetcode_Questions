//Question Link - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        
        //counts the tot no. of circular/square sandwiches
        for (int i = 0; i < students.length; i++) {
            count[students[i]]++;
        }
        
        //if the count goes below 0, we need to break out of the loop
        for (int i = 0; i < students.length; i++) {
            if (--count[sandwiches[i]] < 0) {
                break;
            }
        }
        
        return Math.max(count[0], count[1]);
    }
}
