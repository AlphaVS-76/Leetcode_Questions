class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        //base case
        if(n1 > n2) {
            return false;
        }

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);

        for(int i=0 ; i<n2-n1+1 ; i++){
            String sub = s2.substring(i, n1+i);
            char[] perm = sub.toCharArray();

            Arrays.sort(perm);
            
            boolean check = Arrays.equals(arr, perm);

            if(check){
                return true;
            }
        }

        return false;
    }
}