class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length*matrix[0].length-1;
        
        while(low <= high){
            int mid = (low+high) / 2;

            int row = mid / matrix.length;
            int col = mid % matrix.length;

            if((row < matrix.length && col < matrix[0].length) && matrix[row][col] == target){
                return true;
            }
            else if((row < matrix.length && col < matrix[0].length) && matrix[row][col] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return false;
    }
}