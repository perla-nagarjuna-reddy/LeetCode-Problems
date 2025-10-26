class Solution {
    public int maxChunksToSorted(int[] arr) {

        int ans = arr[0];

        int maxChunks = 0;

        for(int i = 0; i < arr.length; i++){

            ans = Math.max(ans,arr[i]);

            if(i == ans){
                maxChunks++;
            }
        }

        return maxChunks;
    }
}