//Question Link - https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();

        //frequency of each character
        for (Character ch : str) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch, 1);
            }
        }

        //making a list with tuples containing K,V and sort it wrt V
        List<int[]>  l1 = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
            l1.add(new int[]{entry.getKey(), entry.getValue()});
        }
        l1.sort((el1, el2) -> el2[1] - el1[1]);

        //create the sorted string using sorted list
        StringBuilder ans = new StringBuilder();
        for(int[] c : l1){
            char ch = (char) c[0];
            int freq = c[1];

            for(int i=0 ; i<freq ; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
