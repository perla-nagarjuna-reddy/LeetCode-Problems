class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n=x+k;
        int m=y+k;
        for(int i=y;i<m;i++){
            int t=x;
            int b=n-1;
            while(t<b){
                int temp=grid[b][i];
                grid[b][i]=grid[t][i];
                grid[t][i]=temp;
                t++;
                b--;
            }
        }
        return grid;
    }
}