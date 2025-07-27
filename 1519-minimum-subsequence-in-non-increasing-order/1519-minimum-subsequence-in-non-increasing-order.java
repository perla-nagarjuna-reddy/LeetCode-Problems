class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        Arrays.sort(nums);

        int arrSum = 0;

        for(int val : nums){
            arrSum+= val;
        }

        List<Integer> lst = new ArrayList<>();

        int sum  = 0;

        for(int i = nums.length - 1; i >=0; i--){
            sum = sum + nums[i];
            lst.add(nums[i]);
            if(sum > arrSum - sum){
                break;
            }
        }

        return lst;
    }
}