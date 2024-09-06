class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n*n];
        int ind = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[ind++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);
        return arr[k-1];
    }
}