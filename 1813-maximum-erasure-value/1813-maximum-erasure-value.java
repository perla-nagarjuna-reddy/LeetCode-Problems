class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int start = 0;

        int end = 0;

        int sum = 0;

        int ans = 0;

        Set<Integer> set = new HashSet<>();

        while(end < nums.length){

            while(set.contains(nums[end])){
                set.remove(nums[start]);
                sum = sum - nums[start];
                start++;
            }

            set.add(nums[end]);

            sum = sum + nums[end];

            ans = Math.max(ans,sum);

            end++;
        }

        return ans;
    }
}