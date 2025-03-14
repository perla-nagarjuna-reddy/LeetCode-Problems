class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                dp[i][j] = -1;
            }
        }

        return solve(0,0,m,n,grid,dp);
    }

    public int solve(int row, int col, int m, int n, int[][] grid, int[][] dp){
        if(row >= m || col >= n){
            return Integer.MAX_VALUE / 2;
        }

        if(row == m - 1 && col == n - 1){
            return grid[row][col];
        }

        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int down = grid[row][col] + solve(row + 1, col, m, n, grid, dp);
        int right = grid[row][col] + solve(row, col + 1, m, n, grid, dp);

        return dp[row][col] = Math.min(down, right);
    }
}