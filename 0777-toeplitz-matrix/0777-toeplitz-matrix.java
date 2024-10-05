class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<col;i++){
            int row1 = 0;
            int col1 = i;
            int val = matrix[row1][col1];
            while(row1 < row-1 && col1 < col-1 ){
                if(val != matrix[row1+1][col1+1]){
                    return false;
                }
                row1 = row1+1;
                col1 = col1+1;
            }
        }
        for(int i=0;i<row;i++){
            int row1 = i;
            int col1 = 0;
            int val = matrix[row1][col1];
            while(row1 < row-1 && col1 < col-1 ){
                if(val != matrix[row1+1][col1+1]){
                    return false;
                }
                row1 = row1+1;
                col1 = col1+1;
            }
        }

        return true;
    }
}