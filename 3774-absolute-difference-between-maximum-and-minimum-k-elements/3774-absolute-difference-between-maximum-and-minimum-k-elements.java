class Solution {
    public int absDifference(int[] nums, int k) {
        
        Arrays.sort(nums);

        int smallSum = 0;

        int largeSum = 0;

        int n = nums.length;


        for(int i = 0; i < k; i++){

            smallSum += nums[i];
            largeSum += nums[n-i - 1];
        }


        return Math.abs(smallSum - largeSum);
    }
}