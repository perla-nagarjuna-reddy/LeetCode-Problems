class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
        int n = matrix.length;
        for(int i=0;i<4;i++){
           rotate90Degree(matrix,n);
            if(checkIfMatching(matrix,target,n)){
                return true;
            }

        }
        return false;
    }
    public boolean checkIfMatching(int[][] matrix,int[][] target,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public void rotate90Degree(int[][] matrix,int n){
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = matrix[n-j-1][i];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}