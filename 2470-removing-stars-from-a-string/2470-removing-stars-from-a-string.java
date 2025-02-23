class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){

            // check if char is *
            if(ch == '*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }

        // just appending the characters left in the stack
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}