class Solution {
    int freshOranges = 0;
    public int orangesRotting(int[][] grid) {
        
        int n  = grid.length;

        int m = grid[0].length;
        
        int count = 0;

        int[][] vis = new int[n][m];

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){

                if(grid[i][j] == 2){
                    q.add(new int[]{i,j,0});
                    vis[i][j] = 2;
                }
                else{
                    vis[i][j] = 0;
                }
            }
        }

        int ans = 0;

        while(!q.isEmpty()){

            int[] cell = q.poll();

            int row = cell[0];
            int col = cell[1];

            int time = cell[2];

            ans = Math.max(time,ans);

            int[] dRow = {-1,1,0,0};
            int[] dCol = {0,0,-1,1};

            for(int i = 0 ; i < 4 ;i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if(nRow >=0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == 1 && vis[nRow][nCol] != 2){
                    grid[nRow][nCol] = 2;
                    vis[nRow][nCol] = 2;
                    q.add(new int[]{nRow,nCol,time+1});
                }
            }
        }

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){

                if(vis[i][j] != 1 && grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return ans;
    }
}