class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while(i < n && intervals[i][0] < newInterval[0]){
           arr.add(intervals[i]);
           i = i+1;
        }

        while(i < n && intervals[i][0] < newInterval[1]){
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
        return merge(ans);
    }
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end  = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int[] temp = intervals[i];
            if(temp[0] >= start && temp[0] <= end){
                end = Math.max(end,temp[1]);
            }
            else{
                ans.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        int[][] final_ans = new int[ans.size()][2];
        int ind = 0;
        for(int[] ls : ans){
            final_ans[ind++] = ls;
        }
        return final_ans;

    }
}