class Solution {
    public int removeElement(int[] nums, int val) {
        int j = -1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                j = i;
                break;
            }
            else{
                count++;
            }
        }
        if(j == -1) return count;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i] != val){
                count++;
                swap(nums,i,j);
                j++;
            }
        }
        return count;
    }

    public void swap(int[] nums,int num1,int num2){
        int temp = nums[num2];
        nums[num2] = nums[num1];
        nums[num1] = temp;
    }
}