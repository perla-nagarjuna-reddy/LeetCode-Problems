class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans  = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }

        int[] leftRow = new int[n];
        int[] LowerDiagonal = new int[2*n-1];
        int[] UpperDiagonal = new int[2*n-1];
        Solve(0,board,ans,leftRow,LowerDiagonal,UpperDiagonal,n);
        return ans;
    }

    public void Solve(int col,char[][] board,List<List<String>> ans,int[] leftRow,int[] LowerDiagonal,int[] UpperDiagonal,int n){
        if(col == n){
            ans.add(construct(board));
            return;
        }

        for(int row=0;row < n;row++){
            if(leftRow[row] == 0 && LowerDiagonal[row+col] == 0 && UpperDiagonal[n-1+col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                LowerDiagonal[row+col] = 1;
                UpperDiagonal[n-1+col-row] = 1;
                Solve(col+1,board,ans,leftRow,LowerDiagonal,UpperDiagonal,n);
                board[row][col] = '.';
                leftRow[row] = 0;
                LowerDiagonal[row+col] = 0;
                UpperDiagonal[n-1+col-row] = 0;
            }
        }
    }

    public List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }

        return res;
    }
}