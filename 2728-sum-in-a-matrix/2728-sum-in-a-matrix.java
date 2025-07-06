class Solution {
    public int matrixSum(int[][] nums) {
        
        int ans = 0;

        int[][] vis = new int[nums.length][nums[0].length];

        for(int k = 0; k < nums[0].length; k++){
            int max = 0;
            for(int i = 0; i < nums.length; i++){
                int maxRow = 0;
                int row = -1;
                int col = -1;
                for(int j = 0; j < nums[i].length;j++){
                    if(vis[i][j] == 0 && nums[i][j] > maxRow){
                        maxRow = nums[i][j];
                        row = i;
                        col = j;
                    }
                }
                if(row != -1 && col != -1){
                    vis[row][col] = 1;
                }
                max = Math.max(max,maxRow);
            }
            ans = ans + max;
        }
        return ans;
    }
}