class Solution {
    public int numOfSubarrays(int[] arr) {
        int ans = 0;

        int oddCount = 0;

        int evenCount = 1;

        int preSum = 0;

        for(int val : arr){
            preSum += val;

            if(preSum % 2 == 0){
                ans+=oddCount;
                evenCount++;
            }
            else{
                ans+=evenCount;
                oddCount++;
            }
            ans = ans % 1_000_000_007;
        }
        return ans;
    }
}