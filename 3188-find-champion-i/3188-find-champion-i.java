class Solution {
    public int findChampion(int[][] grid) {
        
        int ans = -1;
        int prev = 0;
        for(int i=0;i<grid.length;i++){
            int count = 0;

            for(int j=0;j<grid.length;j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }

            if(count > prev){
                ans = i;
                prev = count;
            }
        }

        return ans;
    }
}