class Solution {
    public int[][] largestLocal(int[][] grid) {

        int n = grid.length;

        int[][] ans = new int[n-2][n-2];

        for(int i = 0 ; i < grid.length - 2; i++){

            for(int j = 0; j < grid.length - 2; j++){

                int max = 0;

                for(int k = i; k < i+3; k++){

                    for(int m = j; m < j+3; m++){
                        max = Math.max(grid[k][m],max);
                    }
                }

                ans[i][j] = max;
            }
        }

        return ans;
    }
}