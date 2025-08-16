class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int minBuy = prices[0];

        int ans = 0;

        for(int i = 1 ; i < prices.length; i++){
            
            int profit = prices[i] - minBuy;

            if(profit > 0){
                ans = ans + profit;
            }

            minBuy = prices[i];
        }

        return ans;
    }

    // int tabulation(int[] prices){
    //     int n = prices.length;

    //     int[][] dp = new int[n+1][2];

    //     dp[n][0] = dp[n][1] = 0;

    //     for(int i = 0; i < n + 1; i++){
    //         Arrays.fill(dp[i],0);
    //     }

    //     for(int ind = n - 1; ind>= 0; ind--){
    //         for(int buy=0;buy<=1;buy++){
    //             int profit = 0;

    //             if(buy == 1){
    //                 profit = Math.max(-prices[ind]+dp[ind+1][0],dp[ind+1][1]);
    //             }
    //             else{
    //                 profit = Math.max(prices[ind]+dp[ind+1][1],dp[ind+1][0]);
    //             }

    //             dp[ind][buy] = profit;
    //         }
    //     }

    //     return dp[0][1];
    // }
}