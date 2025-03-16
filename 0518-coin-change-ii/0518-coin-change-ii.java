class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for(int i = 0 ; i < n; i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = solve(n-1, amount, coins, dp);

        return ans;
    }

    public int solve(int ind, int target , int[] coins, int[][] dp){

        if(ind == 0){
            if(target % coins[0] == 0) {
                return 1;
            }
            else{
                return 0;
            }
        }

        if(dp[ind][target] != -1) return dp[ind][target];

        int notTaken = solve(ind - 1, target,coins,dp);

        int taken = 0;

        if(coins[ind] <= target){
            taken  = solve(ind, target - coins[ind],coins,dp);
        }

        return dp[ind][target] = taken + notTaken;
    }
}