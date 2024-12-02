class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();

        int count = 0;

        int start = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                count++;
            }
            if(ch == ')'){
                count--;
            }

            if(count == 0){
                result.append(s.substring(start+1,i));
                start = i + 1;
            }
        }
        return result.toString();
    }
}