class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        if(s.length() == 1) return 0; 
        int zeros = 0;

        int ones = 0;

        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '0'){
                zeros++;
            }
            if(s.charAt(i) == '1'){
                ones++;
            }

            if(zeros == ones){
                ans = Math.max(ans,zeros + ones);
                ones = 0;
                zeros = 0;
            }

            if(zeros>ones){
               ans = Math.max(ans,ones+ones);
               if(i<s.length()-1 && s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                   ones =0;
                   zeros = 0;
               }
            }
            if(ones > zeros){
                int diff = ones - zeros;
                ans = Math.max(ans, ones + zeros - diff);
                ones = 0;
                zeros = 0;
            }
        }
        return ans == Integer.MIN_VALUE?0:ans;
    }   
}