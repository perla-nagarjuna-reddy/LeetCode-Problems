class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int n = grid.length;

        int m = grid[0].length;

        int[] rowOnes = new int[n];
        int[] rowZeros = new int[n];
        int[] colOnes = new int[m];
        int[] colZeros = new int[m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j  < m ; j++){
                if(grid[i][j] == 0){
                    rowZeros[i]++;
                }
                else if(grid[i][j] == 1){
                    rowOnes[i]++;
                }

            }
        }

        for(int j = 0 ; j < m ; j++){
            for(int i = 0 ; i  < n ; i++){
               
                if (grid[i][j] == 0) {
                    colZeros[j]++; 
                } else {
                    colOnes[j]++;
                }
            }
        }

        int ans[][] = new int[n][m];

        for(int i = 0 ; i  < n ; i++){
            for(int j  = 0 ; j < m; j++){
                ans[i][j] = rowOnes[i] + colOnes[j] - rowZeros[i] - colZeros[j];
            }
        }

        return  ans;
    }
}