class Solution {
    public void sort(int[][] mat, int row, int col, int rowLen, int colLen){
        ArrayList<Integer> list = new ArrayList<>();
        int r = row;
        int c = col;

        while(r < rowLen && c < colLen){
            list.add(mat[r++][c++]);
        }

        Collections.sort(list);
        r = row;
        c = col;
        int k = 0;

        while(r < rowLen && c < colLen){
            mat[r++][c++] = list.get(k++);
        }
    }

    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        //col wise
        for(int i = 0 ; i < col ; i++){
            sort(mat, 0, i, row, col);
        }

        //row wise
        for(int i = 1 ; i < row ; i++){
            sort(mat, i, 0, row, col);            
        }

        return mat;
    }
}