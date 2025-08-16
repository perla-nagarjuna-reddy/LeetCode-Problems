class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];

        int posInd = 0;

        int negInd = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] < 0){
                ans[negInd] = nums[i];
                negInd+=2;
            }
            else{
                ans[posInd] = nums[i];
                posInd+=2;
            }
        }

        return ans;
    }
}