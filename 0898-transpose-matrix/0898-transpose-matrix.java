class Solution {
    public int[][] transpose(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = nums[j][i];
            }
        }

        return ans;
    }
}