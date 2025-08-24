class Solution {
    public int splitArray(int[] nums, int k) {
        
        int min = 0;

        int sum = 0;

        for(int val : nums){
            sum+=val;
            min = Math.min(val,min);
        }

        int low = min;
        int high = sum;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canSplit(nums, mid, k)){
                
                low = mid + 1;
            }
            else{
                high = mid  - 1;
            }
        }

        return low;
    }

    public boolean canSplit(int[] nums, int largeSum, int k){

        int count = 1;

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            if(sum > largeSum){
                count++;
                sum = nums[i];
            }
        }

        return count > k;
    }
}