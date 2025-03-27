class Solution {
    public int lengthOfLIS(int[] nums) {
        int n =  nums.length;

        int[][] dp = new int[n][n+1];

        for(int i = 0; i < n ; i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = solve(0, -1, nums,n,dp);

        return ans;
    }

    int  solve(int ind, int prev_ind,int[] nums, int n,int[][] dp){

        if(ind == n) return  0;


        if(dp[ind][prev_ind+1] != -1) return dp[ind][prev_ind+1];


        int notTake = solve(ind+1,prev_ind,nums,n,dp);

        int take  = 0 ;

        if(prev_ind == -1 || nums[ind] > nums[prev_ind]){
            take = 1 + solve(ind+1,ind,nums,n,dp);
        }

        return dp[ind][prev_ind+1]=Math.max(take,notTake);
    }
}