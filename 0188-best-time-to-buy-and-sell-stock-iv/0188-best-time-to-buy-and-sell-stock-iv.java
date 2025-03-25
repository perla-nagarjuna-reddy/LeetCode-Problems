class Solution {
    public int maxProfit(int K, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][K+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= 1; j++){
                for(int k = 0; k < K+1;k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        return solve(0,prices,1,K,dp);
        
    }
    public int solve(int ind,int[] prices, int buy, int cap,int[][][] dp){
        if(cap == 0) return 0;

        if(ind == prices.length) return 0;

        if(dp[ind][buy][cap] != -1) return dp[ind][buy][cap];

        int profit = 0;

        if(buy == 1){
            profit = Math.max(-prices[ind]+solve(ind+1,prices,0,cap,dp),solve(ind+1,prices,1,cap,dp));
        }
        else{
            profit = Math.max(prices[ind]+solve(ind+1,prices,1,cap - 1,dp),solve(ind+1,prices,0,cap,dp));
        }

        return dp[ind][buy][cap] = profit;
    }

}