class Solution {
    public String resultingString(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){

            if(!st.isEmpty()){

                char top = st.peek();

                int diff = Math.abs(top - ch);

                if(diff == 1 || diff == 25){
                    st.pop();
                    continue;
                }
            }

            st.push(ch);
        }

        StringBuilder sb = new StringBuilder();


        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }

        return sb.toString();
    }
}