class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int n = nums.length;

        int count = 0;

        int ans = 0;

        for(int i = 1; i < n; i++){
            if(nums[i-1] < nums[i]){
                count++;
            }

            else{
                ans = Math.max(count,ans);
                count = 0;
            }
        }
        ans = Math.max(count,ans);
        return ans+1;
    }
}