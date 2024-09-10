class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum2 = 0;
        for(int val : nums){
            sum^=val;
        }
        for(int i=0;i<=n;i++){
            sum2^=i;
        }

        return sum^sum2;
    }
}