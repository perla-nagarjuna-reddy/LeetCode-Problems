class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        
        int[] prefix = new int[n];

        int[] suffix = new int[n];

        prefix[0] = cardPoints[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + cardPoints[i];
        }

        suffix[n-1] = cardPoints[n-1];

        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] + cardPoints[i];
        }

        int max = 0;
        for (int i = 0; i <= k; i++) {
            int front = i > 0 ? prefix[i - 1] : 0;
            int back = k - i > 0 ? suffix[n - (k - i)] : 0;
            max = Math.max(max, front + back);
        }

        return max;
    }
}