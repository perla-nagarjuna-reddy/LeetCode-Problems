class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        for(int i = 0 ;i < n ; i++){
            if(nums[i] % 2 == 0){
                ans[i] = 0;
            }
            else{
                ans[i] = 1;
            }
        }

        int i = 0;
        
        for(int j = 0 ; j < n; j++){
            if(ans[j] == 0){
                int temp = ans[j];
                ans[j] = ans[i];
                ans[i] = temp;
                i++;
            }
        }

        return ans;
    }
}