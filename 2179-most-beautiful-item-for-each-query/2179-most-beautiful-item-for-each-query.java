class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        
        Arrays.sort(items,(a,b) ->{
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        int n = items.length;

        int[] prefixMax = new int[n];

        prefixMax[0] = items[0][1];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i-1], items[i][1]);
        }

        int[] ans = new int[queries.length];

        for(int i = 0; i < queries.length; i++){

            int pos = getLastPosition(items,queries[i]) - 1;

            if(pos == -1){
                ans[i] = 0;
            }
            else{
                ans[i] = prefixMax[pos];
            }
        }

        return ans;

    }

    public int getLastPosition(int[][] items,int k){

        int low = 0;

        int high = items.length - 1;

        int ans = items.length;

        while(low <= high){

            int mid = low + (high - low) / 2;

            int val = items[mid][0];

            if(val > k){
                ans = mid;
                high = mid  - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}