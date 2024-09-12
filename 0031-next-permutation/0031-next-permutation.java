class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i] > nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }

    public void swap(int[] nums,int num1,int num2){
        int temp = nums[num2];
        nums[num2] = nums[num1];
        nums[num1] = temp;
    }
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}