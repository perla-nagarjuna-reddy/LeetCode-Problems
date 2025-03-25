class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= 1; j++){
        //         for(int k = 0; k < 3;k++){
        //             dp[i][j][k] = -1;
        //         }
        //     }
        // }
        for(int ind = n - 1; ind >= 0; ind--){
        for(int buy = 0; buy <= 1; buy++){
            for(int cap = 1; cap <= 2; cap++){
                if(buy == 1){
                    dp[ind][buy][cap] = Math.max(-prices[ind]+dp[ind+1][0][cap],dp[ind+1][1][cap]);
                }
                else{
                    dp[ind][buy][cap] = Math.max(prices[ind]+dp[ind+1][1][cap-1],dp[ind+1][0][cap]);
                }
            }
        }
    }
        // return solve(0,prices,1,2,dp);
        return dp[0][1][2];
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

    // Tabulation Code

    

}