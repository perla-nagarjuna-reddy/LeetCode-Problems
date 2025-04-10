class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;

        for(int i = 0 ; i < nums.length; i++){
            
            for(int j = i ; j < nums.length; j++){
                if(Math.abs(nums[j] - nums[i]) <= Math.min(nums[i],nums[j])){
                    ans = Math.max(ans,nums[i]^nums[j]);
                }
            }
        }

        return ans;
    }
}