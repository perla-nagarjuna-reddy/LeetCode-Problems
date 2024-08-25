class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k > 0 && st.peek()-'0' > num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));

        }

        while(k > 0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";

        String res = "";
        while(!st.isEmpty()){
            // System.out.println(st.peek());
            // char ch = Character.valueOf(st.pop());
            res+=st.peek();
            st.pop();
        }
        while(res.length() !=0 && res.charAt(res.length()-1) == '0'){
            res = new StringBuilder(res).deleteCharAt(res.length()-1).toString();
        }
        res = new StringBuilder(res).reverse().toString();

        if(res.length() == 0){
            return "0";
        } 
        return res;
    }
}