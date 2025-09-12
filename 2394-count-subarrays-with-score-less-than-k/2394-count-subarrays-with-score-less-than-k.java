class Solution {
    public long countSubarrays(int[] nums, long k) {

        int low = 0;

        int high = 0;

        long sum = 0;

        long ans = 0;

        while(high < nums.length){

            sum = sum + nums[high];

            while(sum * (high - low + 1) >= k){

                sum = sum - nums[low++];
            }

            ans += (long)high - low + 1;

            high++;
        }

        return ans;
    }
}