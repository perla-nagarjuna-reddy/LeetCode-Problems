class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while(i < n && intervals[i][1] < newInterval[0]){
           arr.add(intervals[i]);
           i = i+1;
        }

        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i = i+1;
        }
        arr.add(newInterval);
        
        while(i < n){
            arr.add(intervals[i]);
            i++;
        }

        int[][] ans = new int[arr.size()][2];
        int ind = 0;
        for(int[] ar : arr){
            ans[ind++] = ar;
        }
        return ans;
    }
}