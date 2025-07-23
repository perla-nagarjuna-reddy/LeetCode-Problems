class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x > y){
            return getMax(s,'a','b',x,y);
        }
        return getMax(s,'b','a',y,x);
    }

    public int getMax(String s, char first, char second, int x, int y){


        Stack<Character> st = new Stack<>();

        int ans = 0;

        for(char ch : s.toCharArray()){

            if (!st.isEmpty() && st.peek() == first && ch == second) {
                st.pop();
                ans += x;
            } else {
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb.reverse();

        st.clear();

        for(char ch : sb.toString().toCharArray()){

            if (!st.isEmpty() && st.peek() == second && ch == first) {
                st.pop();
                ans += y;
            } else {
                st.push(ch);
            }
        }

        return ans;

    }
}