class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for(int val : nums){
            sum = sum + val;
        }
        int newTarget = (sum - target) / 2;

        if((sum - target) <  0 || (sum - target) % 2 == 1) return 0;

        int n  = nums.length;

        int[][] dp = new int[n][newTarget+1];

        for(int i = 0 ; i < n; i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(n - 1, newTarget, nums,dp);
    }

    public int  solve(int ind, int target, int[] nums, int[][] dp){

        if (ind == 0){
            if (target == 0 && nums[0] == 0) return 2;
            if (target == 0 || nums[0] == target) return 1;
            return 0;
        }

        if(dp[ind][target] != -1) return dp[ind][target];

        int notTaken = solve(ind - 1, target,nums,dp);

        int taken = 0;

        if(nums[ind] <= target){
            taken = solve(ind - 1, target - nums[ind],nums, dp);
        }

        return dp[ind][target] = taken + notTaken;
    }
}