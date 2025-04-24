class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        int count = 0;

        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        int start = intervals[0][0];

        int end = intervals[0][1];

        for(int i = 1 ; i < n; i++){

            int start1 = intervals[i][0];

            int end1 = intervals[i][1];

            if(end >= start1 && end1 <= end){
                count++;
            }else{
                start = start1;
                end = end1;
            }
        }

        return n-count;
    }
}