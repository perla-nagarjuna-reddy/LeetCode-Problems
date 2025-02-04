class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int sum = 0;

        for(int i=0; i < nums.length;i++){

            int ans = nums[i];

            int prev = nums[i];
            
            for(int j=i+1;j<nums.length;j++){

                if(nums[j] > prev){
                    ans = ans + nums[j];
                    prev = nums[j];
                    sum = Math.max(sum,ans);
                }
                else{
                    ans = 0;
                    sum = Math.max(sum,prev);
                    prev = nums[j];
                }
            }
            sum = Math.max(sum,prev);
        }

        return sum;
    }
}