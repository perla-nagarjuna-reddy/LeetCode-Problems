class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(n == 1 && nums[0] <= 0) return 1;
        long min = 0;
        Set<Long> set = new HashSet<>();
        for(int val : nums){
            set.add((long)val);
            min = Math.max(val,min);
        }
        for(long i=1;i<=min+n;i++){
            if(!set.contains(i)){
                return (int)i;
            }
        }

        return -1;
    }
}