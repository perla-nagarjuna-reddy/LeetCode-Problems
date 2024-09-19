class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; 
        int ind = 1;
        int count = 1;

        int i = 1;

        while(i < nums.length){
            if(nums[i] == nums[i-1]) count++;
            else count = 1;

            if(count <= 2){
                nums[ind++] = nums[i];
            }
            i++;
        }

        return ind;
    }
}