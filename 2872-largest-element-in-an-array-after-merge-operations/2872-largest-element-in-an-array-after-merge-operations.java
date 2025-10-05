class Solution {
    public long maxArrayValue(int[] nums) {

        long ans = nums[nums.length - 1];

        long res = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= ans) {
                ans += nums[i];
            } else {
                ans = nums[i];
            }
            res = Math.max(res,ans);
        }

        return ans;

    }
}