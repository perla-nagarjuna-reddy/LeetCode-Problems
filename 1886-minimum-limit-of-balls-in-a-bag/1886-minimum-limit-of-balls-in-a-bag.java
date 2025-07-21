class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        

        int max = 0;

        for(int val :  nums){

            max = Math.max(val,max);
        }

        int low = 1;

        int high = max;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canLimitBalls(nums,mid,maxOperations)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return high + 1;
    }

    public boolean canLimitBalls(int[] nums, int totalballs, int maxOperations){

        long noOfOp = 0;

        for(int i = 0 ; i < nums.length; i++){
            noOfOp += (nums[i] - 1) / totalballs;
        }

        return noOfOp <= maxOperations;
    }
}