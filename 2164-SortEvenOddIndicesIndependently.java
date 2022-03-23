//Question Link - https://leetcode.com/problems/sort-even-and-odd-indices-independently/

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        //edge case
        if(nums.length<=2){
            return nums;
        }
        
        //making two new arrays (even, odd) to put respective elements into it
        int odd[] = new int[nums.length/2];
        int even[];
        
        if(nums.length % 2 == 0){
            even = new int[nums.length/2];
        }
        else {
            even = new int[(nums.length/2)+1];
        }
        
        //putting elements alternatively in new arrays from the old array 
        int a = 0;
        int b = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                even[a] = nums[i];
                a++;
            }
            else{
                odd[b] = nums[i];
                b++;
            }
        }
        
        Arrays.sort(even);
        Arrays.sort(odd);
        
        ////putting elements alternatively in the old array after sorting
        int o = odd.length-1; 
        int e = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                nums[i] = even[e];
                e++;
            }
            else{
                nums[i] = odd[o];
                o--;
            }
        }
        
        return nums;
    }
}
