class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int row = 0 ; row < m ; row++){
            int min = Integer.MAX_VALUE;
            for(int col = 0; col < n ; col++){
                min = Math.min(matrix[row][col],min);
            }
            temp.add(min);
        }
        for(int col = 0 ; col < n ; col++){
            int max = Integer.MIN_VALUE;
            for(int row = 0; row < m ; row++){
                max = Math.max(matrix[row][col],max);
            }
            if(temp.contains(max)){
                ans.add(max);
            }
        }

        return ans;
    }
}