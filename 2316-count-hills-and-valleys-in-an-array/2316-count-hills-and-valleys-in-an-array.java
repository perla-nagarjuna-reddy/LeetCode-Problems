class Solution {
    public int countHillValley(int[] nums) {
        
        int noOfHills = 0;
        int noOfVal = 0;

        for(int i = 1 ; i < nums.length - 1; i++){

            int j = i-1;
            int k = i+1;

            if (nums[i] == nums[i - 1]) continue;

            while(k < nums.length && nums[i] == nums[k]) k++;

            while(j >= 0 && nums[i] == nums[j]) j--;

            if(j >= 0 && k < nums.length){
                if(nums[i] > nums[j] && nums[i] > nums[k]){
                    noOfHills++;
                }
                if(nums[i] < nums[j] && nums[i] < nums[k]){
                    noOfVal++;
                }
            }
        }

        return noOfVal + noOfHills;
    }
}