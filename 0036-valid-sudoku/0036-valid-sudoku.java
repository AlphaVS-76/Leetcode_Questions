class Solution {
    public boolean checkDupe(char[][] mat, int a, int b){
        HashSet<Integer> set = new HashSet<>();

        for(int i = a ; i < a+3 ; i++){
            for(int j = b ; j < b+3 ; j++){
                if(mat[i][j] != '.'){
                    if(set.contains(mat[i][j]-'0')){
                        return false;
                    }
                    else{
                        set.add(mat[i][j]-'0');
                    }
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> set = new HashSet<>();
        boolean check = false;

        //this iterates every 3x3 cube
        for(int i = 0 ; i < 9 ; i += 3){
            for(int j = 0 ; j < 9 ; j+=3){
                check = checkDupe(board, i, j);
                if(!check){
                    return check;
                }
            }
        }

        //for every row-wise iteration
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j]-'0')){
                        return false;
                    }
                    else{
                        set.add(board[i][j]-'0');
                    }
                }
            }
            set = new HashSet<>();
        }

        //for every col-wise iteration
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i]-'0')){
                        return false;
                    }
                    else{
                        set.add(board[j][i]-'0');
                    }
                }
            }
            set = new HashSet<>();
        }

        return check;
    }
}