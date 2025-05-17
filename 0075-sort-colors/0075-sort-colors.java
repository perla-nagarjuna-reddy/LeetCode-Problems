class Solution {
    public void sortColors(int[] nums) {
        
        int countZero = 0;

        int countOne = 0;

        int countTwo = 0;


        for(int num : nums){

            if(num == 0){
                countZero++;
            }
            else if(num == 1){
                countOne++;
            }
            else{
                countTwo++;
            }
        }

        for(int i = 0 ; i < nums.length; i++){

            if(countZero != 0){
                nums[i] = 0;
                countZero--;
                continue;
            }
            else if(countOne != 0){
                nums[i] = 1;
                countOne--;
                continue;
            }
            else{
                nums[i] = 2;
                countTwo--;
            }
        }
    }
}