//Question Link - https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(String ch: operations){
            //these operations are the same conceptually
            if(ch.equals("++X") || ch.equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }

        return x;
    }
}
