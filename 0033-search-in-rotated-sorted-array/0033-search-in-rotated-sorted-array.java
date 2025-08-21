class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;
        int low = 0;

        int high = nums.length - 1;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] >= nums[0]){
                ans = mid;
                low = mid + 1;
            }
            else{
                
                high = mid -1;
            }
        }

        int l1=0,r1=ans;

        int l2=ans+1,r2 = n-1;

        if(target>=nums[0]){
            low=l1;
            high= r1;
        }
        else{
            low = l2;
            high = r2;
        }

        ans = -1;

        high = nums.length - 1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }
}