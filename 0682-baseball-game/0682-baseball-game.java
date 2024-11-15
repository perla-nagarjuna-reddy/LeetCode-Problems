class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("+")){
                int first = st.pop();
                int second = st.pop();
                int third = first + second;
                st.push(second);
                st.push(first);
                st.push(third);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int mult = 2 * st.peek();
                st.push(mult);
            }
            else{
                st.push(Integer.valueOf(s));
            }
        }
        
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}