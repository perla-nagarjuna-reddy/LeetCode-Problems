class Solution {
    public int[][] merge(int[][] intervals) {
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
        int[][] final_ans = new int[ans.size()][2];
        int ind = 0;
        for(int[] ls : ans){
            final_ans[ind++] = ls;
        }
        return final_ans;

    }
}


// List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         // for(int i=0;i<n;i++){
//         //     if(ans.isEmpty() || ans.get(i).get(0) > ans.get(i-1).get(1)){
//         //         ans.add(i).add(intervals[i]);
//         //     }
//         //     else{
//         //         ans.get(i-1).add(Math.max(ans.get(i-1).get(1),ans.get(i).get(1)));
//         //     }
//         // }

//         for(int i=0;i<intervals.length;i++){
//             System.out.println(Arrays.toString(intervals[i]));
//         }

//         return new int[][]{{0,0}};