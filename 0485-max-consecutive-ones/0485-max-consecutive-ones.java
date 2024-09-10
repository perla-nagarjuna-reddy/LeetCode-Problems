class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                max = Math.max(sum,max);
                sum = 0;
            }
            else{
                sum++;
            }
        }
        max = Math.max(sum,max);
        return max;
    }
}