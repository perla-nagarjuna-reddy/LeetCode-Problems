class Solution {
    public void setZeroes(int[][] matrix) {

        HashMap<Integer,int[]> map = new HashMap<>();

        int k = 1;

        for(int i = 0 ; i < matrix.length; i++){

            for(int j = 0; j < matrix[0].length; j++){

                if(matrix[i][j] == 0){

                    map.put(k++,new int[]{i,j});
                }
            }
        }

        for(int[] arr : map.values()){

            int row = arr[0];

            int col = arr[1];

            int rowLength = matrix.length;

            int colLength = matrix[0].length;

            for(int i=0; i < colLength; i++){

                matrix[row][i] = 0;
            }

            for(int i=0; i < rowLength; i++){

                matrix[i][col] = 0;
            }
        }
    }
}