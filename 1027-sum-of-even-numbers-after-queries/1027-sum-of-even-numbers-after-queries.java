class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int key = queries[i][1];
            int val = queries[i][0];
            nums[key] = nums[key] + val;
            int sum = 0;
            for(int j=0;j<n;j++){
                if((nums[j] & 1) != 1){
                    sum+=nums[j];
                }
            }

            ans[i] = sum;
        }

        return ans;
    }
}