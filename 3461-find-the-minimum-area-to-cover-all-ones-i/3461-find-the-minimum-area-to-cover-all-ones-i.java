class Solution {
    public int minimumArea(int[][] grid) {
        
        int row = grid.length;

        int col = grid[0].length;

        int min_row = Integer.MAX_VALUE;
        int max_row = Integer.MIN_VALUE;
        int min_col = Integer.MAX_VALUE;

        int max_col = Integer.MIN_VALUE;


        for(int  i = 0; i < row; i++){

            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    min_row = Math.min(min_row,i);
                    max_row = Math.max(max_row,i);
                    min_col = Math.min(min_col,j);
                    max_col = Math.max(max_col,j);
                }
            }
        }

        return (max_col - min_col + 1) * (max_row - min_row + 1);
    }
}