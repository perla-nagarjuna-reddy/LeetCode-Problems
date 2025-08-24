class Solution {
    public int splitArray(int[] nums, int k) {
        
        int min = Integer.MIN_VALUE;

        int sum = 0;

        for(int val : nums){
            sum+=val;
            min = Math.max(val,min);
        }

        int low = min;
        int high = sum;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canSplit(nums, mid, k)){
                
            //    ans = mid;
               high = mid - 1;
            }
            else{
                low = mid  + 1;
            }
        }

        return low;
    }

    public boolean canSplit(int[] arr, int largeSum, int k){

        int totalSum = 0;

        int subArray = 1;

        for(int i=0;i<arr.length;i++){
            if(totalSum + arr[i] <= largeSum){
                totalSum+=arr[i];
            }
            else{
                subArray++;
                totalSum = arr[i];
            }
        }

        return subArray <= k;
    }
}