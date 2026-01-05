class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int ans = 0;

        for(int i = 0; i < nums.length; i++){

            int sum = 0;

            int div = 0;

            for(int j = 1; j* j <= nums[i]; j++){

                if(nums[i] % j == 0){
                    int d1 = j;
                    int d2 = nums[i] / j;

                    if(d1 == d2){
                        div++;
                        sum+=d1;
                    }
                    else{
                        div+=2;
                        sum+= d1 + d2;
                    }
                }

                if(div > 4){
                    break;
                }
            }
            if (div == 4) {
                ans += sum;
            }
        }

        return ans;
    }
}