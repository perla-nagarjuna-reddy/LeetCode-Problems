class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int start = 0;

        int end = 0;

        int sum = 0;

        int ans = Integer.MAX_VALUE;

        while(end < nums.length){

            sum += nums[end];

            if(sum < target){
                end++;
                continue;
            }

            else if(sum >= target){

                while(sum >= target){
                    ans = Math.min(end - start + 1, ans);
                    sum = sum - nums[start];
                    start++; 
                }

                end++;
                
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}