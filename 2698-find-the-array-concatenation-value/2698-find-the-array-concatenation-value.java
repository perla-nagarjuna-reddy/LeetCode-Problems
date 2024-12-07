class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;

        int i = 0;

        int j = nums.length - 1;

        while(i <= j){
            if(i == j){
                ans = ans + nums[i];
                break;
            }
            String val = String.valueOf(nums[i])+String.valueOf(nums[j]);
            ans =ans + Integer.parseInt(val);
            i++;
            j--;
        }

        return ans;
    }
}