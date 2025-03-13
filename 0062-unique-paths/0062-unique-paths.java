class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0 ; j < n; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,0,m-1,n-1,dp);

    }

    int solve(int i, int j,int m, int n,int[][] dp){

        if(i == m  && j == n){
            return 1;
        }

        if(i > m || j > n){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int up = solve(i+1,j,m,n,dp);
        int left = solve(i,j+1,m,n,dp);

        return dp[i][j]=up + left;
    }
}