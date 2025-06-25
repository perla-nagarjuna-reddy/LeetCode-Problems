class Solution {
    public boolean isStrictlyPalindromic(int n) {

        int i = 2;

        while(i <= n - 2){
            String st = "";
            int temp = i;
            while(temp != 0){
                st = st + temp % 2;
                temp = temp / 2;
            }
            boolean isPali = checkPalindrome(st);

            if(!isPali) return false;
            i++;
        }

        return true;
    }
    public boolean checkPalindrome(String st){
        int i = 0;

        int j = st.length() - 1;

        while(i <= j){
            if(st.charAt(i) != st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}