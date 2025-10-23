class Solution {
    public boolean checkValidGrid(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] != 0) return false;

        int[] movesX = {2,1,-1,-2,-2,-1,1,2};

        int[] movesY = {1,2,2,1,-1,-2,-2,-1};

        return solve(n,grid,movesX,movesY,0,0,0);
        
    }

    public static boolean solve(int n,int[][]grid,int[] movesX,int[] movesY,int row, int col,int step){

        if (step == n * n - 1) return true;

        for(int i = 0; i < 8; i++){

            int nextRow = row + movesX[i];

            int nextCol = col + movesY[i];

            if(isValid(n,grid,nextRow,nextCol,step)){

                boolean isTourCompleted = solve(n,grid,movesX,movesY,nextRow,nextCol,step + 1);

                if(isTourCompleted == true){
                    return true;
                }
            }

        }

        return false;
    }

    public static boolean isValid(int n, int[][] grid,int row, int col,int step){

        if(row >= 0 &&  row < n && col >= 0 && col < n && grid[row][col] == step + 1){
            return true;
        }

        return false;
    }
}