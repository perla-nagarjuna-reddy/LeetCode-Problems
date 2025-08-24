class Solution {
    public int longestSubarray(int[] nums) {

        int count = 0;
        boolean first_zero = false;
        int last_index_i = 0;
        int ans = Integer.MIN_VALUE;

        int i = 0, j = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
            
                if (!first_zero) {
                    first_zero = true;
                } else {
                    // just calculate ans whenever it hits 2nd zero and initialize count to 1 as we already reached the 2nd zero;
                    ans = Math.max(ans, (j - i - 1)); 
                    i = last_index_i + 1;
                    
                }
                last_index_i = j; 
            }
            j++; 
        }
        ans = Math.max(ans, j - i - 1);
        return ans;
    }
}