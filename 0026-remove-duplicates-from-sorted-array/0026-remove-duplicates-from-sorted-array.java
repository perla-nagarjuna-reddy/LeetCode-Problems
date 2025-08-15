class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 0;

        int count = 0;

        for(int i  = 0 ; i < nums.length - 1; i++){
            
            if(nums[i] == nums[i+1]){
                continue;
            }
            else if (nums[i] != nums[i+1]){
                nums[index++] = nums[i];
                count++;
            }
        }
        
        if(index < nums.length){
            nums[index] = nums[nums.length - 1];
            count++;
        }
        return count;
    }
}