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
}