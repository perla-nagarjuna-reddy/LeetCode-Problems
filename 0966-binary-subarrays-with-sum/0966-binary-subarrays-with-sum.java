class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSub(nums,goal) - countSub(nums,goal-1);
    }
    public int countSub(int[] nums,int goal){
        if(goal < 0) return 0;
        int l = 0;
        int r = 0;
        int cnt = 0;
        int sum = 0;
        while(r < nums.length){
            sum+=nums[r];
            while(sum > goal){
                sum = sum - nums[l];
                l++;
            }
            cnt = cnt+(r-l+1);
            r++;

        }
        return cnt;
    }
}