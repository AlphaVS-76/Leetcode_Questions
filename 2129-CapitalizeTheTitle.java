//Question Link - https://leetcode.com/problems/capitalize-the-title/

class Solution {
    public String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();

		for(int i = 0 ; i < ch.length ; ++i) {
			int firstIndex = i; 
            
            //using bitwise operator to capitalize letter
			while(i < ch.length && ch[i] != ' ') {
				ch[i] |= 32; 
                ++i;
			}

			if(i - firstIndex > 2) { 
				ch[firstIndex] &= ~32; 
			}
		}

		return String.valueOf(ch);
    }
}
