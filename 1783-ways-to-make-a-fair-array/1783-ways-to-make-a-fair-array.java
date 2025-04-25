class Solution {
    public int waysToMakeFair(int[] nums) {

        int evenSum = 0;

        int oddSum = 0;

        for(int i = 0 ; i < nums.length; i++){

            if(i % 2  == 0){
                evenSum+=nums[i];
            }
            else{
                oddSum+=nums[i];
            }
        }

        int leftEvenSum = 0;
        int leftOddSum = 0;

        int ans = 0;

        for(int i = 0 ; i < nums.length; i++){

            if(i % 2 == 0){
                evenSum-=nums[i];
            }
            else{
                oddSum-=nums[i];
            }

            if(leftEvenSum + oddSum  == leftOddSum + evenSum){
                ans++;
            }

            if(i % 2 == 0){
                leftEvenSum+=nums[i];
            }
            else{
                leftOddSum+=nums[i];
            }
        }

        return ans;
    }
}