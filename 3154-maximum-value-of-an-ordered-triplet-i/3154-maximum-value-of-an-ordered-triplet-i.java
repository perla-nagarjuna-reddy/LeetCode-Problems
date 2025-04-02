class Solution {
    public long maximumTripletValue(int[] nums) {
        
        long ans = 0;

        int n = nums.length;

        for(int i = 0; i < n-2; i++){

            for(int j = i+1; j < n-1; j++){

                for(int k = j+1; k < n; k++){

                    long sum = (nums[i] - nums[j]);

                    ans = (long)Math.max(ans,sum * nums[k]);
                }
            }
        }

        return ans;
    }
}