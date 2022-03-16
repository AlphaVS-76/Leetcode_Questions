//Question Link - https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        //approach = runner's technique
        //how? take multiple test cases and find a pattern
        //pattern in this question = the squared sum is repeating itself after some numbers which means there's a cycle in this
        int slow = n;
        int fast = n;

        do{
            slow = sqNum(slow);        //equivalent to slow.next
            fast = sqNum(sqNum(fast)); //equivalent to fast.next.next
        }while(slow != fast);

        if(fast == 1){ //equivalent to if(fast == null)
            return true;
        }

        return false;
    }

    public int sqNum(int num){
        int sum = 0;
        int temp = 0;

        while(num > 0){
            temp = (num % 10) * (num % 10);
            sum += temp;
            num /= 10;
        }

        return sum;
    }
}
