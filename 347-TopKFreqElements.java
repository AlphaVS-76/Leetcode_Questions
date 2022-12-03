//Question Link - https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //base case
        if(nums.length == 1){
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        //frequency of each element
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        //making a list with tuples containing K,V and sort it wrt V
        List<int[]>  l1 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            l1.add(new int[]{entry.getKey(), entry.getValue()});
        }
        l1.sort((el1, el2) -> el2[1] - el1[1]);

        //create arraylist and add from end
        List<Integer> list = new ArrayList<>();
        for(int[] c: l1){
            if(k == 0){
                break;
            }
            list.add(c[0]);
            k--;
        }

        //converting arraylist into array
        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }


        return arr;
    }
}
