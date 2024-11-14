class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(currentChar);
            }
        }
        String ans = "";

        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }
        return ans;
    }
}