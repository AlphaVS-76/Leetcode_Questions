class Solution {
    public long findTheArrayConcVal(int[] num) {
        long con = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        
        for(int i: num){
            nums.add(i);
        }

        while(nums.size() != 0){
            if(nums.size() == 1){
                con += nums.get(0);
                nums.remove(0);
                break;
            }

            con += Integer.parseInt(Integer.toString(nums.get(0))+Integer.toString(nums.get(nums.size()-1)));
            nums.remove(0);
            nums.remove(nums.size()-1);
        }

        return con;
    }
}