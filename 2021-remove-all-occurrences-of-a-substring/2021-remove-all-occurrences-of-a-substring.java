class Solution {
    public String removeOccurrences(String s, String part) {

        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            
            if (st.size() >= part.length()) {

                boolean isPossible = true;

                for (int j = 0; j < part.length(); j++) {

                    if (st.get(st.size() - part.length() + j) != part.charAt(j)) {
                        isPossible = false;
                        break;
                    }

                }
                
                if (isPossible) {

                    for (int j = 0; j < part.length(); j++) {
                        st.pop();
                    }
                    
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}