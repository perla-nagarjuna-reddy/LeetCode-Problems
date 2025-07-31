class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target == 0) return 0;

        return lowerBound(nums,target);
    }
    public static int lowerBound(int[] nums, int x){

        int low = 0;

        int high = nums.length - 1;

        int ans = nums.length;

        while(low <= high){

            int mid  = low + (high - low) / 2;

            if(nums[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}