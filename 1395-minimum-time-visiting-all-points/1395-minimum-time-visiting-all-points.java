class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int sum = 0;

        for(int i = 1; i < points.length; i++){

            int low = Math.abs(points[i][0] - points[i - 1][0]);

            int high =Math.abs(points[i][1] - points[i - 1][1]);

            sum = sum +  Math.max(low, high);
        }

        return sum;
    }
}