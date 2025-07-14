class Solution {
    public int[][] diagonalSort(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            List<Integer> lst = new ArrayList<>();
            int row = i, col = 0;
            while (row < n && col < m) {
                lst.add(grid[row++][col++]);
            }
            
            Collections.sort(lst);
            row = i;
            col = 0;
            int ind = 0;
            while (row < n && col < m) {
                grid[row++][col++] = lst.get(ind++);
            }
        }
        for (int i = 1; i < m; i++) {
            List<Integer> lst = new ArrayList<>();
            int row = 0, col = i;
            while (row < n && col < m) {
                lst.add(grid[row++][col++]);
            }
            Collections.sort(lst);
            row = 0;
            col = i;
            int ind = 0;
            while (row < n && col < m) {
                grid[row++][col++] = lst.get(ind++);
            }
        }
        return grid;
    }
}