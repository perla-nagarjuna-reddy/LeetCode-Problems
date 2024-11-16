class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        int lastFound = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                if(lastFound != -1 && (i - lastFound - 1) < k){
                    return false;
                }
                lastFound = i;
            }
        }

        return true;
    }
}