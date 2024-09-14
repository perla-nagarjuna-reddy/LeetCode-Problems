class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void swap(int[][] matrix,int row,int col,int col1,int row1){
        int temp = matrix[col1][row1];
        matrix[col1][row1] = matrix[row][col];
        matrix[row][col] = temp;
    }
}