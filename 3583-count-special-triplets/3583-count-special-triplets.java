import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        long count = 0;

        HashMap<Integer, Integer> lMap = new HashMap<>();

        HashMap<Integer, Integer> rMap = new HashMap<>();

        for (int num : nums) {
            rMap.put(num, rMap.getOrDefault(num, 0) + 1);
        }

        for (int j = 0; j < n; j++) {
            int num = nums[j];

            rMap.put(num, rMap.get(num) - 1);

            if (rMap.get(num) == 0) rMap.remove(num);

            int target = num * 2;

            int leftCount = lMap.getOrDefault(target, 0);
            
            int rightCount = rMap.getOrDefault(target, 0);

            count = (count + (long) leftCount * rightCount) % MOD;

            lMap.put(num, lMap.getOrDefault(num, 0) + 1);
        }

        return (int) count;
    }
}
