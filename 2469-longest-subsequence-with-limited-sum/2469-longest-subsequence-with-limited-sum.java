class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] ans = new int[queries.length];

        for(int i = 0; i < queries.length; i++){

            int low = 0;

            int high = nums.length - 1;

            int res = -1;

            while(low <= high){

                int mid = low + (high - low) / 2;

                int sum = getSum(nums,mid);

                if(sum <= queries[i]){
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

    public int getSum(int[] nums, int ind){

        int sum = 0;

        for(int i = 0; i <= ind; i++){
            sum+=nums[i];
        }

        return sum;
    }
}