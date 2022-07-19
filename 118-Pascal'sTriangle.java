//Question Link - https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        //base case
        if(numRows == 0){
            return triangle;
        }
        
        //we can observe that 1 is present at the start in the triangle
        first.add(1);

        triangle.add(first);

        for(int i = 1 ; i < numRows ; i++){
            List<Integer> prev = triangle.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            //adding the previous list elements
            for(int j = 1 ; j < i ; j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }

            //for the end of the array, there is another 1
            curr.add(1);
            triangle.add(curr);
        }

        return triangle;
    }
}
