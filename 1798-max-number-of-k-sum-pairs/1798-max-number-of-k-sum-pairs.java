class Solution {
    public int maxOperations(int[] nums, int k) {

        int i = 0;

        int j = nums.length - 1;

        Arrays.sort(nums);

        int count = 0;

        while(i < j){

            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] > k ){
                j--;
            }
            else{
                i++;
            }
        }

        return count;
    }
}