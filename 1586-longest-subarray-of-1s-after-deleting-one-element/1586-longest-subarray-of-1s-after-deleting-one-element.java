class Solution {
    public int longestSubarray(int[] nums) {

        int count = 0;
        int ans = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        while (j < nums.length){
            if(nums[j] == 0){
                count++;
            }

            while (count > 1) {
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }
            ans = Math.max(ans,(j-i));
            j++;
        }

        return ans;
    }
}