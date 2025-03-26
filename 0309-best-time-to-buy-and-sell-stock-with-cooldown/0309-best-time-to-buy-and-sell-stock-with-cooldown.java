class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int[][] dp = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= 1; j++){
                dp[i][j] = -1;
            }
        }

        return solve(0,prices,1,dp);
    }

    public int solve(int ind,int[] prices, int buy,int[][] dp){
        
        if(ind >= prices.length) return 0;

        if(dp[ind][buy] != -1) return dp[ind][buy];

        int profit = 0;

        if(buy == 1){
            profit = Math.max(-prices[ind]+solve(ind+1,prices,0,dp),solve(ind+1,prices,1,dp));
        }
        else{
            profit = Math.max(prices[ind]+solve(ind+2,prices,1,dp),solve(ind+1,prices,0,dp));
        }

        return dp[ind][buy] = profit;
    }
}