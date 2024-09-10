class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum2 =0 ;
        for(int i=0;i<n;i++){
            sum2 = sum2^nums[i];
            sum = sum ^ (i+1);
        }
        return sum ^ sum2;

    }
}