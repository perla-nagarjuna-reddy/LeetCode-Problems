class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<int[]> valueIndexPairs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            valueIndexPairs.add(new int[]{nums[i], i});
        }

        valueIndexPairs.sort((a, b) -> b[0] - a[0]);

    
        List<int[]> topK = valueIndexPairs.subList(0, k);
        topK.sort((a, b) -> a[1] - b[1]);


        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = topK.get(i)[0];
        }

        return ans;
    }
}