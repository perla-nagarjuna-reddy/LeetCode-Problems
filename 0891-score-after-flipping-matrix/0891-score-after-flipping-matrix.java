class Solution {
    public int matrixScore(int[][] grid) {

        int m = grid.length;

        int n = grid[0].length;


        for(int i = 0; i < m; i++){

            if(grid[i][0] == 0){
                for(int j = 0; j < n; j++){
                    if(grid[i][j] == 1){
                        grid[i][j] = 0;
                    }
                    else{
                        grid[i][j] = 1;
                    }
                }
            }
        }

        //counting zeros in columns


        for(int i = 0 ; i < n; i++){

            int countZero = 0;

            int countOne = 0;


            for(int j = 0; j < m; j++){

                if(grid[j][i] == 1){
                    countOne++;
                }
                else{
                    countZero++;
                }
            }

            if(countZero > countOne){

                for(int j = 0; j < m; j++){

                    if(grid[j][i] == 1){
                        grid[j][i] = 0;
                    }
                    else{
                        grid[j][i] = 1;
                    }
                }
            }
        }

        int ans = 0;

        for(int i = 0; i < m; i++){
            int pow = n - 1;
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    sum = sum +(int)Math.pow(2,pow);
                }
                pow = pow - 1;
            }

            ans = sum + ans;
        }

        return ans;
    }
}