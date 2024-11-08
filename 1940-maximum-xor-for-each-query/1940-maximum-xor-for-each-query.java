class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        List<Integer> lst = new ArrayList<>();
        int[] ans = new int[nums.length];
        for(int val : nums){
            lst.add(val);
        }
        int cumulativeXor = 0;
        for (int val : nums) {
            cumulativeXor ^= val;
        }
        int max = (1 << maximumBit) - 1;
        for (int i = 0; i < nums.length; i++) {
            int maximum = max ^ cumulativeXor;
            ans[i] = maximum;
            int lastElement = lst.remove(lst.size() - 1);
            cumulativeXor ^= lastElement;
        }
        return ans;
    }
}