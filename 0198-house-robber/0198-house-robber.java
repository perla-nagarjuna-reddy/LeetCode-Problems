class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
		int[] dp = new int[n+1];
		Arrays.fill(dp,0);
		return solve(n,nums,dp);
	}

	// static int solve(int ind,ArrayList<Integer> nums,int[] dp){
	// 	if(ind == 0){
	// 		return nums.get(ind);
	// 	}

	// 	if(ind  < 0){
	// 		return 0;
	// 	}

	// 	if(dp[ind] != -1){
	// 		return dp[ind];
	// 	}

	// 	int pick = pick = nums.get(ind) + solve(ind - 2, nums,dp);

	// 	int nonPick = 0 + solve(ind - 1, nums,dp);
	
	// 	return dp[ind] = Math.max(pick,nonPick);
	// }

	static int solve(int n,int[] nums,int[] dp){
		dp[0] = nums[0];

		for(int i = 1; i < n ; i++){

			int val = i - 2;

			int pick = Integer.MIN_VALUE;
			if(val < 0){
				pick = nums[i];
			}
			else if(i > 1){
				pick = nums[i] + dp[i-2];
			}
			
			int nonPick = 0 + dp[i-1];

			dp[i] = Math.max(pick,nonPick);
		}

		return dp[n-1];

	}
}