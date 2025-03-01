class Solution {
    public int[][] updateMatrix(int[][] graph) {
        Queue<int[]> q = new LinkedList<>();

        int n = graph.length;
        int m = graph[0].length;
        
        int[][] ans = new int[n][m];
        
        int[][] vis = new int[n][m];

        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(graph[i][j] == 0){
                    q.add(new int[]{i,j,0});
                    vis[i][j] = 1;
                }
                else{
                    vis[i][j] = 0;
                }
            }
        }
        
        int[] dRow = {-1,0,1,0};
        int[] dCol = {0,1,0,-1};

        while(!q.isEmpty()){
            int[] arr = q.poll(); 
            int row = arr[0];
            int col = arr[1];
            int dist = arr[2];
            ans[row][col] = dist;
            for(int i = 0; i < 4 ; i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];
        
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && vis[nRow][nCol] == 0){
                    vis[nRow][nCol] = 1;
                    q.add(new int[]{nRow,nCol,dist+1});
                }
            } 
        }
        return ans;
    }
}