class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && (String.valueOf(st.peek())+s.charAt(i)).equals("AB") || (String.valueOf(st.peek())+s.charAt(i)).equals("CD") ){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            
        }

        return st.size();
    }
}