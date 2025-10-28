class Solution {
    public int countValidSelections(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){

                int lsum = 0;

                int rsum = 0;

                for(int j = 0; j <= i; j++){
                    lsum+=nums[j];
                }

                for(int j = i; j < nums.length; j++){
                    rsum +=nums[j];
                }


                if(Math.abs(lsum - rsum) == 0){
                    count+=2;
                }
                else if(Math.abs(lsum - rsum) == 1){
                    count+=1;
                }
            }
        }


        return count;
    }
}