class Solution {
    public int maxProfit(int[] prices, int fee) {

        int minBuy = prices[0];

        int maxProfit = 0;

        int ans = 0;

        for(int i = 0; i < prices.length; i++){

            
            minBuy = Math.min(minBuy,prices[i]);

            if(prices[i] - minBuy  > fee){
                ans += prices[i] - minBuy - fee;
                minBuy = prices[i] - fee;
            }

            
        }

        return ans;

    }
}