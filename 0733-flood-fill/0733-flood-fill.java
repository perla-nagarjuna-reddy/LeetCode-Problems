class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgColor = image[sr][sc];
        
        int n = image.length;
        int m = image[0].length;
        
        int[][] vis = new int[n][m];
        
        do_bfs(orgColor,image,vis,color,sr,sc);
        
        return image;
    }
    
    public void do_bfs(int orgColor,int[][] image,int[][] vis,int newColor,int sr,int sc){
        
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{sr,sc});
        
        int n = image.length;
        int m = image[0].length;
        
        vis[sr][sc] = 1;
        
        image[sr][sc] = newColor;
        
        while(!q.isEmpty()){
            
            int[] pair = q.poll();
            
            int row = pair[0];
            
            int col = pair[1];
            
            int[] dRow = {-1, 1, 0, 0}; 
            int[] dCol = {0, 0, -1, 1}; 
            
            for(int i = 0 ; i < 4;i++){
                int nRow = row + dRow[i];
                
                int nCol = col + dCol[i];
                
                if(nRow >= 0 && nRow < n && nCol >=0 && nCol < m && image[nRow][nCol] == orgColor && vis[nRow][nCol] == 0){
                    vis[nRow][nCol] = 1;
                    image[nRow][nCol] = newColor;
                    q.add(new int[]{nRow,nCol});
                }
            }
        }
    }
}