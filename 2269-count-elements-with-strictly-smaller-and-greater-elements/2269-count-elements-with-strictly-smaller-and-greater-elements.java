class Solution {
    public int countElements(int[] nums) {
        int count = 0;

        for(int i=0;i<nums.length;i++){
            boolean isSmaller = false;
            boolean isLarger = false;
            for(int j=0;j<nums.length;j++){
                if(nums[j] > nums[i]){
                    isLarger = true;
                }
                if(nums[j] < nums[i]){
                    isSmaller = true;
                }
            }

            if(isSmaller && isLarger) {
                count++;
            }
        }
        return count;
    }
}