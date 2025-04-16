class Solution {
    public String longestPalindrome(String s) {

        if(s.length() == 1) return s;

        int n = s.length();

        String ans = "";
        int max = 0;

        for(int i = 0; i < n;i++){

            for(int j = i; j < n; j++){

                if(checkPalindrome(i,j,s)){

                    if((j-i+1) > max){
                        ans = s.substring(i,j+1);
                        max = j-i+1;
                    }
                }
            }
        }

        return ans;
    }

    public boolean checkPalindrome(int i , int j,String s){
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}