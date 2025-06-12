class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;


        for(int i = 1 ; i < nums.length; i++){

            max = Math.max(Math.abs(nums[i]-nums[i-1]),max);
        }

        max = Math.max(Math.abs(nums[nums.length - 1]-nums[0]),max);

        return max;
    }
}