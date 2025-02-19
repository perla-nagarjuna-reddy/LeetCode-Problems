class Solution {
    public int longestSubarray(int[] nums) {

        int count = 0;
        boolean first_zero = false;
        int last_index_i = 0;
        int ans = Integer.MIN_VALUE;

        int i = 0, j = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                count++;
                if (!first_zero) {
                    first_zero = true;
                } else {
                    ans = Math.max(ans, (j - i - 1)); 
                    i = last_index_i + 1;
                    count = 1;
                }
                last_index_i = j; 
            }
            j++; 
        }
        ans = Math.max(ans, j - i - 1);
        return ans;
    }
}