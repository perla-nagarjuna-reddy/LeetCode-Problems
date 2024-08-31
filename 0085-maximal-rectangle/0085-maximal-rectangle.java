class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int prefixSum[][] = new int[n][m];

        for(int j=0;j<m;j++){
            int sum = 0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][j]-'0';
                if(matrix[i][j] == '0'){
                    sum = 0;
                }
                prefixSum[i][j] = sum;
            }
        }
        // System.out.println(Arrays.toString(prefixSum[1]));
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int ans = largestRectangleArea(prefixSum[i]);
            max = Math.max(max,ans);
        }
        return max;
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int ele = st.pop();
                int nse = i;
                int pse = st.isEmpty()?-1:st.peek();
                maxArea = Math.max(maxArea, heights[ele] * (nse-pse-1));

            }st.push(i);
        }

        while(!st.isEmpty()){
            int nse = n;
            int ele = st.pop();
            int pse = st.isEmpty()?-1:st.peek();
            maxArea = Math.max(maxArea, heights[ele] * (nse-pse-1));
        }
        return maxArea;
    }
}