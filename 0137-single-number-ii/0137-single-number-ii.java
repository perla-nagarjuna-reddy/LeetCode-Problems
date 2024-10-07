class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i=-31;i<31;i++){
            int count = 0;

            for(int num : nums){
                if((num & (1 << i)) != 0){
                    count++;
                }
            }
            if(count % 3 == 1){
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
}