class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int val = n * (n+1) / 2;

        final int MOD = 1_000_000_007;

        int ind  = 0;

       int[] arr = new int[val];

        for(int i = 0 ; i < n; i++){

            for(int  j = i; j < n; j++){

                int sum = 0;
                
                for(int k = i; k <= j; k++){
                    sum = (sum + nums[k]) % MOD;
                }

                arr[ind++] = sum;
            }
        }

        Arrays.sort(arr);

        int ans = 0;

        for(int i  = left - 1 ; i < right; i++){
            ans = (ans + arr[i]) % MOD;
        }
        
        return ans;
    }
}