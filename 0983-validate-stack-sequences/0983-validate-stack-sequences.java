class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();

        int ind = 0;

        for(int i = 0 ; i < pushed.length; i++){

            st.push(pushed[i]);

            while(!st.isEmpty() && st.peek() == popped[ind]){
                st.pop();
                ind++;
            }
        }

        return st.isEmpty()? true:false;
    }
}