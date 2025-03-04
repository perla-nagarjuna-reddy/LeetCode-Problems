class Pair{
    int dist;
    int[] arr;

    public Pair(int dist,int[] arr){
        this.dist = dist;
        this.arr = arr;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.dist - y.dist);
        
        int n = heights.length;

        int m = heights[0].length;
        int[][] dist = new int[n][m];
        
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        
        pq.add(new Pair(0,new int[]{0,0}));
        
        dist[0][0] = 0;
        
        int[] dRow = {-1,0,1,0};
        
        int[] dCol = {0,1,0,-1};
        
        while(!pq.isEmpty()){
            
            Pair pair = pq.poll();
            
            int distance = pair.dist;
            
            int row = pair.arr[0];
            
            int col = pair.arr[1];
            
            if(row == n - 1 && col == m - 1) return distance;
            
            for(int i = 0; i < 4; i++){
                int newR = row + dRow[i];
                int newC = col + dCol[i];
                
                if(newR >= 0 && newR < n && newC >= 0 && newC < m){
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[newR][newC]),distance);
                
                    if(newEffort < dist[newR][newC]){
                        dist[newR][newC] = newEffort;
                        pq.add(new Pair(newEffort,new  int[]{newR,newC}));
                    }
                }
            }
        }
        
        return 0;
    }
}