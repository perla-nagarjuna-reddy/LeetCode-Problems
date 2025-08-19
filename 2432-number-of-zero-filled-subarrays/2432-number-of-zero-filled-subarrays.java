class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long ans = 0;

        long countZeros = 0;
        
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                countZeros++;
                continue;
            }
            else{
                ans = ans + ((countZeros*(countZeros+1)) / 2);
                countZeros = 0;
            }
        }

        ans = ans + ((countZeros*(countZeros+1)) / 2);

        return ans;
    }
}