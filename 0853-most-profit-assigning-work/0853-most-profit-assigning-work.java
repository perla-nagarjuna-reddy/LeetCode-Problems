class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int n = difficulty.length;

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = difficulty[i];
            pairs[i][1] = profit[i];
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);


        // Actually this is to get maximum profit so far among the difficulty jobs

        for (int i = 1; i < n; i++) {

            pairs[i][1] = Math.max(pairs[i][1], pairs[i - 1][1]);

        }

        int sum = 0;

        for(int i = 0; i < worker.length; i++){

            int low = 0;

            int high = difficulty.length - 1;

            while(low <= high){

                int mid = low + (high - low) / 2;

                if(pairs[mid][0] <= worker[i]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            if(high >= 0){
                sum = sum + pairs[high][1];
            }
        }

        return sum;
    }
}