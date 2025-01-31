class Solution {
    public int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> list = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i <m;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(grid[i][j]);
            }
            temp.sort((a, b) -> b - a);
            list.add(temp);
        }

        int ans = 0;
        while (!list.get(0).isEmpty()) {
            int max = 0;
            int a = list.size();
            for (int i = 0; i < m; i++) {
                max = Math.max(max, list.get(i).get(0));
                list.get(i).remove(0);
            }
            ans += max;
        }

        return ans;
    }
}