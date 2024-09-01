class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;

        int l=0;
        int r = 0;
        int cnt = 0;
        while(r < nums.length){
            if(nums[r] == 0){
                cnt++;
            }
            while(cnt > k){
                if(nums[l] == 0){
                    cnt--;
                }
                l++;
            }
            max = Math.max(r-l+1,max);
            r++;
        }

        return max;
    }
}