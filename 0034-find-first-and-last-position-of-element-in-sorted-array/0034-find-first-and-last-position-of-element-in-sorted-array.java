class Solution {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 1 && nums[0] == target) return new int[]{0,0}; 

        int first = firstOccurence(nums,target);

        if(first == -1) return new int[]{-1,-1};

        int last = lastOccurence(nums,target);

        return new int[]{first,last};

    }

    public int firstOccurence(int[] nums, int target){

        int low = 0;

        int high = nums.length - 1;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid - 1;
                high = mid - 1;
            }
            if(nums[mid] > target){
                high = mid  - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
    public int lastOccurence(int[] nums, int target){

        int low = 0;

        int high = nums.length - 1;

        int ans = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] <= target){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }
}