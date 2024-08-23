class Solution {
    public boolean isValid(String s) {
        Stack<String> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            String ch = String.valueOf(s.charAt(i));

            if(ch.equals("(") || ch.equals("[") || ch.equals("{")){
                st.push(ch);
            }
            else if(st.isEmpty()){
                return false;
            }
            else if(!st.isEmpty() && st.peek().equals("(") && ch.equals(")") ){
                    st.pop();
                }
            else if(!st.isEmpty() && st.peek().equals("{") && ch.equals("}") ){
                st.pop();
            }
            else if(!st.isEmpty() && st.peek().equals("[") && ch.equals("]")){
                st.pop();
            }
            else{
                return false;
            }
            
        }
        System.out.println(st);
        return st.isEmpty();
    }
}