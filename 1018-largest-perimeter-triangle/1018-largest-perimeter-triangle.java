class Solution {
    public int largestPerimeter(int[] nums) {
        
        int ans  = 0;

        Arrays.sort(nums);

        for(int i = nums.length - 1; i >= 0; i--){

            if(i-2 >= 0){

                int first = nums[i];

                int second = nums[i-1];

                int third = nums[i-2];

                if(second + third > first){

                    ans = Math.max(ans, first + second + third);
                }
            }
        }

        return ans;
    }
}