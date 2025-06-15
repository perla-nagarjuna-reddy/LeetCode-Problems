class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int i = 0;

        int ans = 0;

        while(i != n){
            ans = ans + nums[i];
            i = i + 2;
        }

        return ans;
    }
}