class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        ArrayList<int[]> lst = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++){

            int newStart = intervals[i][0];
            int newEnd = intervals[i][1];

            if(newStart >= start && newStart <= end){
                end = Math.max(end,newEnd);
            }else{
                int[] arr = new int[2];
                arr[0] = start;
                arr[1] = end;
                start = newStart;
                end = newEnd;
                lst.add(arr);
            }
        }

        lst.add(new int[]{start,end});

        int[][] ans = new int[lst.size()][2];

        for(int i = 0; i < lst.size(); i++){

            ans[i] = lst.get(i);
        }

        return ans;
    }
}