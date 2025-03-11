class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int i = 0;
        int j = 0;

        double sum = 0;

        double windowSum = -Double.MAX_VALUE;

        while(j < n){
            sum = sum + nums[j];
            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1) == k){
        
                windowSum = Math.max(sum,windowSum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }

        return windowSum / k;
    }
}