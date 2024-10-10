class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int ans = 0;
        int prevEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            
            if(intervals[i][0] < prevEnd){
                ans++;
            }
            else{
                prevEnd = intervals[i][1];
            }
        }

        return ans;
    }
}