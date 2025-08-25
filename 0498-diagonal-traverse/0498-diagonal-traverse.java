class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m * n];
        int ind = 0;

        for (int i = 0; i < m; i++) {
            int col = 0;
            int row = i;
            ArrayList<Integer> ans = new ArrayList<>();

            while (row >= 0 && col < n) {
                ans.add(mat[row][col]);
                col++;
                row--;
            }

            if (i % 2 == 1) {
                Collections.reverse(ans);
            }

            for (int val : ans) {
                res[ind++] = val;
            }
        }

        for (int i = 1; i < n; i++) {
            int row = m-1;
            int col = i;      
            ArrayList<Integer> ans = new ArrayList<>();
            while (row >=0 && col < n) {
                ans.add(mat[row][col]);
                row--; col++;
            }
            if ((i + m - 1) % 2 == 1) Collections.reverse(ans);

            for (int val : ans) res[ind++] = val;
        }

        return res;
    }
}