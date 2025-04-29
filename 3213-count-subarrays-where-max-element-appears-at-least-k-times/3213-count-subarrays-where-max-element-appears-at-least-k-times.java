class Solution {
    public long countSubarrays(int[] nums, int k) {

        int max = Integer.MIN_VALUE;

        for(int val : nums){
            max = Math.max(val,max);
        }

        int i = 0 ; 

        int j = 0;

        long ans = 0;

        int count = 0 ;


        while(j < nums.length){

            if(nums[j] == max){
                count++;
            }

            while (count >= k) {

                // ans += nums.length - j;
                if (nums[i] == max) {
                    count--;
                }
                i++;
            }

            j++;
            ans += i;
        }

        return ans;

    }
}