class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] ans = new int[queries.length];

        int[] preSum = new int[nums.length];

        preSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            preSum[i] = preSum[i - 1] + nums[i];
        }

        for(int i = 0; i < queries.length; i++){

            int low = 0;

            int high = nums.length - 1;

            int res = -1;

            while(low <= high){

                int mid = low + (high - low) / 2;

                if(preSum[mid] <= queries[i]){
                    res = mid;
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            ans[i] = res + 1;
        }

        return ans;
    }
}