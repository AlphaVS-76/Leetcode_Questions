class Solution {
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    public void reverseString(char[] s) {
        for(int i = 0 ; i < s.length/2 ; i++){
            swap(s, i, s.length-1-i);
        }
    }
}