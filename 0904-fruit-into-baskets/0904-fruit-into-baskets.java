class Solution {
    public int totalFruit(int[] fruits) {
        //base case
        if(fruits.length <= 2){
            return fruits.length;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = fruits.length;
        int ans = 0;

        while(i < n){   
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[j], map.get(fruits[j])-1);
                if(map.get(fruits[j]) == 0){
                    map.remove(fruits[j]);
                }

                j++;
            }
            
            ans = Math.max(ans, i-j+1);
            i++;
        }

        return ans;
    }
}