class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        long goodPairs = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i; // Transformation: nums[i] - i
            goodPairs += countMap.getOrDefault(key, 0); // Count good pairs seen before
            countMap.put(key, countMap.getOrDefault(key, 0) + 1); // Update frequency
        }

        long totalPairs = (long) n * (n - 1) / 2; // Total pairs in the array
        return totalPairs - goodPairs;
    }
}