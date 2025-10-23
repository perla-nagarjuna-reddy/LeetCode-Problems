class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }

    public boolean solve(char[][] board,int row, int col){

        if(row == 9) return true;

        if (col == 9) return solve(board, row + 1, 0);

        if (board[row][col] != '.') return solve(board, row, col + 1);


        for(int  i = 1; i <=9 ; i++){

            boolean isSafe = isSafeToPlace(board,row,col,i);

            if(isSafe){
                 board[row][col] = (char)(i + '0');
                if(solve(board,row,col+1)){
                    return true;
                }
                else{
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public boolean isSafeToPlace(char[][] board, int row, int col, int num){

        // to check rowwise and column wise

        for(int i = 0; i < 9; i++){
            int num1 = board[row][i] - '0';

            int num2 = board[i][col] - '0';

            if(num1 == num) return false;
            if(num2 == num) return false;

        }

        // to check in 3 * 3 grid
        int rowPos = row / 3;

        int colPos = col / 3;

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                int gRow = 3 * rowPos + i;

                int gCol = 3 * colPos + j;

                int num1 = board[gRow][gCol] -'0';

                if(num1 == num) return false;
            }
        }

        return true;
    }
}