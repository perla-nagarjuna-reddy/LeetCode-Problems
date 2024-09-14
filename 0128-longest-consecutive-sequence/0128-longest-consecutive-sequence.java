class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1;
        int count = 1;
        int last_smaller = Integer.MIN_VALUE;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == last_smaller){
                count = count + 1;
                last_smaller = nums[i];
            }
            else if(nums[i] != last_smaller){
                count = 1;
                last_smaller = nums[i];
            }
            longest = Math.max(longest,count);
        }

        return longest;
    }
}