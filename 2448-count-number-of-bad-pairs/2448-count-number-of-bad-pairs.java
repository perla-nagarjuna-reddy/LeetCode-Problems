class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        long goodPairs = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int key = nums[i] - i;
            goodPairs += countMap.getOrDefault(key, 0);
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        long totalPairs = (long) n * (n - 1) / 2;
        return totalPairs - goodPairs;
    }
}