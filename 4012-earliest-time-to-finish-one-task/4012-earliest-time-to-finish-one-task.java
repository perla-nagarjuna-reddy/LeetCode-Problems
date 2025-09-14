class Solution {
    public int earliestTime(int[][] tasks) {

        int ans = Integer.MAX_VALUE;

        for(int[] arr : tasks){

            int start = arr[0];

            int end = arr[1];

            ans = Math.min(ans,start+end);
        }

        return ans;
    }
}