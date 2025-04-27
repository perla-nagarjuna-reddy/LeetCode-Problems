class Solution {
    public int countSubarrays(int[] nums) {
        int ans = 0;

        int i = 0 ; 
        
        int j = 0 ; 

        while(j <  nums.length){

            if((j - i + 1) < 3){
                j++;
            }
            else if((j - i + 1) == 3){
                double sum  = nums[i] + nums[j];
                double second = (double)nums[j-1] / 2.0;
                if(sum == second) ans++;
                i++;
                j++;
            }
        }

        return ans;
    }
}