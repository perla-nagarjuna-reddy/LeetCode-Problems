class Solution {
    public int[] findRightInterval(int[][] intervals) {

        int n = intervals.length;

        int[] ans = new int[n];

        for(int i = 0 ; i < n ; i++){

            int val = intervals[i][1];
            int ind = -1;

            int minStart = Integer.MAX_VALUE;

            for(int j = 0; j < n ; j++){

                int start = intervals[j][0];

                if(start >= val && start < minStart){
                    minStart = start;
                    ind = j;
                }
                
            }

            ans[i] = (ind == Integer.MAX_VALUE?-1:ind);
        }

        return ans;
    }
}