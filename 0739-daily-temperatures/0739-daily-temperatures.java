class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();

        int n = temperatures.length;

        int[] ans = new int[n];

        for(int i = temperatures.length - 1; i >= 0 ;i--){

            int val = temperatures[i];

            while (!st.isEmpty() && temperatures[st.peek()] <= val) {
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = 0;
            }
            else{
                ans[i] = st.peek() - i;
            }

            st.push(i);
            
        }

        return ans;
    }
}