class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        double maxDiagonal = Double.MIN_VALUE;

        int ans = 0;

        for(int i = 0; i < dimensions.length; i++){

            int length = dimensions[i][0];
            int width = dimensions[i][1];

            double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

            int area = length * width;
           
            if(diagonal > maxDiagonal){
                maxDiagonal = diagonal;
                ans = area;
            }
            else if(diagonal == maxDiagonal){
                ans = Math.max(ans,area);
            }
        }

        return ans;
    }
}