class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;

        for(int i=j+1;i<nums.length;i++){
            if(nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
    }

    public void swap(int[] nums,int num1,int num2){
        int temp = nums[num2];
        nums[num2] = nums[num1];
        nums[num1] = temp;
    }
}