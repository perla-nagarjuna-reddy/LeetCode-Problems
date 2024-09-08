class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int r = 0;
        int ans = -1;

        while(r < nums.length){
            if (nums[l] == 1 && nums[r] == 1) {
                r++;
            }
            else if (nums[r] == 0) {
                r++;
                l=r;
            }
            ans = Math.max(ans, r - l);
        }
        // ans = Math.max(r-l,ans);
        System.out.println(l+" "+r);
        return ans;
    }
}