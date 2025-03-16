class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = solve(n - 1, amount, coins, dp);

        return ans == 1000000000?-1:ans;
    }
    static int solve(int ind,int target,int[] coins,int[][] dp){

        // if(target == 0) return 0;

        if(ind == 0){
            if(target % coins[0] == 0) {
                return target / coins[0];
            }
            else{
                return (int)(1e9);
            }
        }

        if(dp[ind][target] != -1) return dp[ind][target];

        int notTaken = solve(ind-1,target,coins,dp);

        int taken = Integer.MAX_VALUE;

        if(coins[ind] <= target){
            taken = 1+solve(ind, target - coins[ind], coins,dp);
        }

        return dp[ind][target] = Math.min(taken, notTaken);
    }
}