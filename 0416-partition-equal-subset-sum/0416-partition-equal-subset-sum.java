    class Solution {
        public boolean canPartition(int[] arr) {

            int sum = 0;
        
            for(int i = 0 ; i < arr.length; i++){
                sum = sum + arr[i];
            }

            if(sum % 2 == 1){
                return  false;
            }

            int target = sum / 2;

            int[][] dp = new int[arr.length+1][target+1];

            for(int i = 0 ; i < arr.length+1; i++){
                for(int j = 0 ; j < target+1; j++){
                    dp[i][j] = -1;
                }
            }
            return solve(arr.length-1,target,arr,dp);
        }

        static boolean solve(int ind, int target, int[] arr, int[][] dp) {

            if (target == 0)
                return true;

            
            if (ind == 0)
                return arr[0] == target;

            if (dp[ind][target] != -1)
                return dp[ind][target] == 0 ? false : true;

        
            boolean notTaken = solve(ind - 1, target, arr, dp);

            boolean taken = false;
            if (arr[ind] <= target){
                taken = solve(ind - 1, target - arr[ind], arr, dp);
            }
            dp[ind][target] = notTaken || taken ? 1 : 0;
            return notTaken || taken;
        }

    }
