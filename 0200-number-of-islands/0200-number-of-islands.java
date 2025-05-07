class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] vis = new int[n][m];

        for(int  i = 0 ; i < n ; i ++){
            for(int j = 0;  j < m ; j++){

                if(vis[i][j] == 0 && grid[i][j] == '1'){
                    count++;
                    do_bfs(i,j,grid,vis);
                }
            }
        }

        return count;
    }

    public void do_bfs(int row,int col,char[][] grid,int[][] vis){
        vis[row][col] = 1;
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        q.add(new int[]{row,col});

        while(!q.isEmpty()){
            int[] rowCol = q.poll();

            int[] dRow = {-1, 1, 0, 0}; 
            int[] dCol = {0, 0, -1, 1}; 

            row = rowCol[0];

            col = rowCol[1];

            for (int i = 0; i < 4; i++) {
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == '1' && vis[nRow][nCol] == 0) {
                    vis[nRow][nCol] = 1;
                    q.add(new int[]{nRow, nCol});
                }
            }
        }
    }
}