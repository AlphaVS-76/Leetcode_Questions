class Solution {
    public boolean div(int num){
        int temp = num;
        while(num>0){
            if(num%10==0 || temp%(num%10)!=0){
                return false;
            }

            num /= 10;
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();

        for(int i = left ; i <= right ; i++){
            if(div(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}