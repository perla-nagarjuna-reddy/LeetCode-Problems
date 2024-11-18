class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return -1;
        }

        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        Arrays.fill(leftMin, Integer.MAX_VALUE);
        Arrays.fill(rightMin, Integer.MAX_VALUE);
        int currentMin = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            currentMin = Math.min(currentMin, nums[i - 1]);
            leftMin[i] = currentMin;
        }

        currentMin = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            currentMin = Math.min(currentMin, nums[i + 1]);
            rightMin[i] = currentMin;
        }

        int minSum = Integer.MAX_VALUE;
        for (int j = 1; j < n - 1; j++) {
            if (leftMin[j] < nums[j] && rightMin[j] < nums[j]) {
                minSum = Math.min(minSum, leftMin[j] + nums[j] + rightMin[j]);
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}