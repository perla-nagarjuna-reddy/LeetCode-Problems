class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if (!st.isEmpty() && st.peek() == current) {
                st.pop();
            } else {
                st.push(current);
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}