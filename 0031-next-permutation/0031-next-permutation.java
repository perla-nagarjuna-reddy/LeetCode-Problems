class Solution {
    public void nextPermutation(int[] nums) {
        
        int ind = -1;

        for(int i = nums.length - 2; i>=0; i--){

            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            reverse(nums,0,nums.length -1);
            return;
        }

        for(int i = nums.length - 1; i>ind; i--){
            if(nums[i] > nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }

        reverse(nums,ind + 1,nums.length - 1);
    }

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void reverse(int[] nums, int start, int end){

        while(start < end){

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}