class Solution {
    public int triangleNumber(int[] nums) {

        int count = 0;

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){


                for(int k = j + 1; k < nums.length; k++){

                    int a = nums[i];

                    int b = nums[j];

                    int c = nums[k];

                    if((a + b ) > c){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}