class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;

        long[] preSum = new long[n];

        preSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + nums[i];
        }

        int start = 0;

        int[] ans = new int[nums.length];

        Arrays.fill(ans,-1);

        if (k == 0) return nums;

        if (2 * k + 1 > n) return ans; 

        for(int i= 0; i < n; i++){

            int back = i - k;

            int front = i + k;

            if(back >=0 && front < nums.length){

                long total = preSum[front] - (back > 0 ? preSum[back - 1] : 0);
                
                ans[i] = (int)(total / (2 * k + 1)); 
            }
        }

        return ans;
    }
}