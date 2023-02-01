class Solution {
    public int countSubstrings(String s, String t) {
        int count = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < t.length(); j++) {
				int diff = 0;
                //pointers to traverse strings
				int p1 = i;
				int p2 = j;
				
                while (p1<s.length() && p2<t.length()){
					if(s.charAt(p1++) != t.charAt(p2++)) {
                        diff++;
                    }
                    
					if(diff == 1) {
                        count++;
                    }
					if(diff == 2){
                        break;
                    }
				}
			}
		}

		return count;
    }
}