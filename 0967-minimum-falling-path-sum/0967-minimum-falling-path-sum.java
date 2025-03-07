class Pair{
    int dist;
    int[] arr;

    public Pair(int dist, int[] arr){
        this.dist = dist;
        this.arr = arr;
    }
}
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.dist - y.dist);

        int n = matrix.length;

        if(n == 1){
            return matrix[0][0];
        }

        int[][] dist = new int[n][n];
        int min = Integer.MAX_VALUE;
        int r = 0;
        int c = 0;
        for(int i = 0 ; i < n ;i++){
            for(int j = 0; j < n ;j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        


        for(int i = 0 ; i < n ; i++){
            pq.add(new Pair(matrix[0][i],new int[]{0,i}));

            dist[0][i] = matrix[0][i];
        }

        int[] dRow = {1,1,1};
        int[] dCol = {-1,0,1};

        while(!pq.isEmpty()){

            Pair pair = pq.poll();

            int distance = pair.dist;

            int row = pair.arr[0];

            int col = pair.arr[1];

            for(int i = 0 ; i < 3 ; i++){
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if(nRow >= 0 && nRow < n && nCol >=0 && nCol < n){
                    int newDist = distance + matrix[nRow][nCol];

                    if(newDist < dist[nRow][nCol]){
                        dist[nRow][nCol] = newDist;
                        pq.add(new Pair(newDist,new int[]{nRow,nCol}));
                    }
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            ans = Math.min(dist[n-1][i],ans);
        }

        return ans;
    }
}
