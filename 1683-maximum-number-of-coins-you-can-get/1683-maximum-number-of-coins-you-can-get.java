class Solution {
    public int maxCoins(int[] piles) {

        Arrays.sort(piles);

        int n = piles.length / 3;

        int ans = 0;

        for(int i = n; i < piles.length; i+=2){
            ans = ans + piles[i];
        }

        return ans;
    }
}