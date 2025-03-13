class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0 ; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,0,m-1,n-1,dp,obstacleGrid);

    }

    int solve(int i, int j,int m, int n,int[][] dp,int[][] grid){

        if (i > m || j > n) {
            return 0;
        }

        // If there is an obstacle, no path can pass through this cell
        if (grid[i][j] == 1) {
            return 0;
        }

        // If we reach the bottom-right corner, return 1 valid path
        if (i == m && j == n) {
            return 1;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = solve(i+1,j,m,n,dp,grid);
        int left = solve(i,j+1,m,n,dp,grid);

        return dp[i][j]= up + left;
    }
}