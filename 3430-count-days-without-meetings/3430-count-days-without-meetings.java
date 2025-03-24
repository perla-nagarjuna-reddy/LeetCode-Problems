class Solution {
    public int countDays(int days, int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1];
                }
            }
        });

        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end  = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int[] temp = intervals[i];
            if(temp[0] >= start && temp[0] <= end){
                end = Math.max(end,temp[1]);
            }
            else{
                int[] arr = new int[2];
                arr[0] = start;
                arr[1] = end;
                ans.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        ans.add(new int[]{start,end});

        int uncoveredDays = 0;
        
        if (ans.get(0)[0] > 1) {
            uncoveredDays += ans.get(0)[0] - 1;
        }

        // Counting gaps between merged intervals
        for (int i = 1; i < ans.size(); i++) {
            uncoveredDays += ans.get(i)[0] - ans.get(i - 1)[1] - 1;
        }

        // Counting days after the last merged interval
        if (ans.get(ans.size() - 1)[1] < days) {
            uncoveredDays += days - ans.get(ans.size() - 1)[1];
        }

        return uncoveredDays;

    }
}