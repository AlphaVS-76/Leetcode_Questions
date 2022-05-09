//Question Link - https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {    
    public List<String> letterCombinations(String digits) {
        //creating refernce for every number passed to it
        String[] mapping = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> res = new ArrayList<>();
		
        //base case
        if (digits.isEmpty()) {
			return res;
		}

		res.add("");
		
        for (char i : digits.toCharArray()) {
			List<String> temp = new ArrayList<>();
			int a = Character.getNumericValue(i);
			
            for (char j : mapping[a].toCharArray()) {
				for (String k : res) {
					temp.add(k.concat(String.valueOf(j)));
				}
			}
			
            res = new ArrayList<>(temp);
		}

		return res;
    }
}
