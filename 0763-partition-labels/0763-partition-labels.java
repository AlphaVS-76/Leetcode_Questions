class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int size = 0;
        int end = 0;

        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), i);
        }

        //this loop checks the range of the char by matching with the map
        for(int i = 0 ; i < s.length() ; i++){
            size++;
                
            end = Math.max(end, map.get(s.charAt(i)));

            if(i == end){
                ans.add(size);
                size = 0;
            }
        }

        return ans;
    }
}