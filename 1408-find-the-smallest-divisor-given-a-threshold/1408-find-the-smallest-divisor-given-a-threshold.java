class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int max = Integer.MIN_VALUE;
        for(int val : nums){
            max = Math.max(val,max);
        }

        int low = 1;
        int high = max;


        while(low <= high){

            int mid = low + (high - low) / 2;

            if(canDivisible(nums, mid,threshold)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canDivisible(int[] nums, int divisor, int threshold){

        int sum = 0;

        for(int num :  nums){

            sum = sum + (int)Math.ceil(((double)num/divisor));

            if(sum > threshold) return false;
        }

        return true;
        
    }

  
}