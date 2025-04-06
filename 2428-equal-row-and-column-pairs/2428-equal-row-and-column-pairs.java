class Solution {
    public int equalPairs(int[][] grid) {

        int ans = 0;

        int n = grid.length;

        int col = 0;

        for(int i = 0; i < n ;i++){

            for(int j = 0 ; j < n ; j++){
                
                boolean isContain = true;

                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isContain = false;
                        break;
                    }
                }
                if(isContain){
                    ans++;
                }
            }
        }
        return ans;
    }
}