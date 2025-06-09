class Solution {
    public int[] diStringMatch(String s) {

        int iVal = 0;

        int dVal = s.length();

        int [] ans = new int[s.length()+1];

        for(int  i = 0 ; i < s.length() + 1; i++){

            if(i < s.length() && s.charAt(i) == 'I'){
                ans[i] = iVal;
                iVal++;
            }
            else if(i < s.length() && s.charAt(i) == 'D'){
                ans[i] = dVal;
                dVal--;
            }
            else{
                ans[i] = iVal;
            }
        }

        return ans;
    }
}