class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int val : nums){
            max = Math.max(val,max);
        }

        int low = 1;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            int val = findingThreshold(nums,mid);
            if(val <= threshold){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
    public int findingThreshold(int[] nums,int mid){
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)mid);
        }

        return sum;

    }
}