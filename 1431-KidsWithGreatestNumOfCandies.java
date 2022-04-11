//Question Link - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public int greatest(int[] arr){
        int g = arr[0];
        
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > g){
                g = arr[i];
            }
        }
        
        return g;
    }
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        //getting the largest element, it indicates if we have to add true or false
        int great = greatest(candies);
        
        for(int i = 0; i < candies.length ; i++){
            if(candies[i]+extraCandies >= great){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        
        return result;
    }
}
