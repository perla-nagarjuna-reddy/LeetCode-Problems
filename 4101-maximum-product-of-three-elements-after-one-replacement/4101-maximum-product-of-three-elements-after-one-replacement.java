class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long ans = Long.MIN_VALUE;

        long base = Math.max(
            (long) nums[n-1] * nums[n-2] * nums[n-3],
            (long) nums[0] * nums[1] * nums[n-1]
        );
        
        ans = Math.max(ans, base);

        int[] candidates = {nums[0], nums[1], nums[2], nums[n-3], nums[n-2], nums[n-1]};

        for (int c : candidates) {
            for (int val : new int[]{-100000, 100000}) {
                List<Integer> temp = new ArrayList<>();
                for (int x : nums) temp.add(x);
                temp.remove(Integer.valueOf(c));
                temp.add(val);
                Collections.sort(temp);

                int m = temp.size();
                long product1 = (long) temp.get(m-1) * temp.get(m-2) * temp.get(m-3);
                long product2 = (long) temp.get(0) * temp.get(1) * temp.get(m-1);
                ans = Math.max(ans, Math.max(product1, product2));
            }
        }

        return ans;
    }
}