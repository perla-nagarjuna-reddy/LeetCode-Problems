class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        if(nums.length < 3){
            return 0;
        }
        int ans = 0;

        for(int i = 0 ; i < nums.length - 1; i++){
            int diff = nums[i+1] - nums[i];
            for(int j = i+2; j < nums.length; j++){
                int num = nums[j] - nums[j-1];
                int len = j - i + 1;
                if(num == diff && len >= 3){
                    ans++;
                }else{
                    break;
                }
            }
        }

        return ans;

    }
}