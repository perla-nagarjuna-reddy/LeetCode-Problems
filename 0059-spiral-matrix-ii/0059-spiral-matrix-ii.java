class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        // ArrayList<Integer> ans = new ArrayList<>();

        int m = matrix[0].length;

        int left = 0, right = n-1;
        int top = 0, bottom = n-1;

        int num = 1;

        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                matrix[top][i] = num;
                num = num +1;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right] = num;
                num = num + 1;
            }
            right--;
            if(top <= bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = num;
                    num = num + 1;
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = num;
                    num = num + 1;
                }
                left++;
            }
        }

        return matrix;
    }
}