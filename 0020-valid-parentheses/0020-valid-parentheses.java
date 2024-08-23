class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            String ch = String.valueOf(s.charAt(i));
            
            if(!st.isEmpty() && st.peek().equals("(") && ch.equals(")") ){
                st.pop();
                continue;
            }
            if(!st.isEmpty() && st.peek().equals("{") && ch.equals("}") ){
                st.pop();
                continue;
            }
            if(!st.isEmpty() && st.peek().equals("[") && ch.equals("]")){
                st.pop();
                continue;
            }
            st.push(ch);
        }
        System.out.println(st);
        return st.isEmpty();
    }
}