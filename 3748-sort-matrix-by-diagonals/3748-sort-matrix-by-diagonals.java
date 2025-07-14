class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            List<Integer> lst = new ArrayList<>();
            int k = 0;
            for (int j = i;j < n ; j++) {
                lst.add(grid[j][k++]);
            }
            Collections.sort(lst);
            Collections.reverse(lst);
            k = 0;
            int idx = 0;
            for (int j = i;j < n ; j++) {
                grid[j][k++] = lst.get(idx++);
            }
        }

        List<List<Integer>> fin1 = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            List<Integer> lst = new ArrayList<>();
            int row = 0, col = i;
            while (row < n && col < n) {
                lst.add(grid[row++][col++]);
            }
            Collections.sort(lst);
            row = 0;
            col = i;
            int idx = 0;
            while (row < n && col < n) {
                grid[row++][col++] = lst.get(idx++);
            }
        }
        return grid;
        
    }
}