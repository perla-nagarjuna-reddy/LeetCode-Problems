class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1){
            return 0;
        }
        int ans = 0;
        int i = 0;
        int prod = 1;

        for (int j = 0; j < nums.length; j++) {
            prod *= nums[j];

            while (prod >= k) {
                prod /= nums[i];
                i++;
            }

            ans += j - i + 1;
        }

        return ans;
    }
}