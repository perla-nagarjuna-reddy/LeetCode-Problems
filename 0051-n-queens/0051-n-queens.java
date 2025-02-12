class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] valid = new int[n][n];
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        int col = 0;

        List<String> res = new ArrayList<>();

        solve(col,board,valid,n,res,ans);

        return ans;
    }

    public void solve(int col,char[][] board,int[][] valid,int n,List<String> res,List<List<String>> ans){
        if(col == n){
            List<String> s = construct(board);
            ans.add(s);
            return;
        }

        for(int row = 0 ; row < n ; row++){

            if(checkValidOrNot(col,row,n,valid)){
                valid[row][col] = 1;
                board[row][col] = 'Q';
                solve(col+1,board,valid,n,res,ans);
                valid[row][col] = 0;
                board[row][col] = '.';
            }
        }
    }

    public boolean checkValidOrNot(int col,int row,int n,int[][] valid){

        for(int i = 0 ; i < col ; i++){
            if(valid[row][i] == 1){
                return false;
            }
        }

        int i = row;
        int j = col;

        // upper diagonal
        while(i >= 0 && j >= 0){
            if(valid[i][j] == 1){
                return false;
            }
            i--;
            j--;
        }

        // lower diagonal
        i = row;
        j = col;

        while(i <n && j >= 0 ){
            if(valid[i][j] == 1){
                return false;
            }
            i++;
            j--;
        }

        return true;
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
