class Solution {
    public int myAtoi(String s){

        if (s == null || s.isEmpty()) return 0;

        s = s.trim();
        
        if (s.isEmpty()) return 0;

        int i = 0;

        int sign = 1;

        long ans = 0;


        if (s.charAt(i) == '+' || s.charAt(i) == '-') {

            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        for( ; i < s.length() && Character.isDigit(s.charAt(i)); i++){


            ans = ans * 10 + (s.charAt(i) - '0');


            if(ans * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(ans * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        }

        return (int) (ans * sign);
    }
}