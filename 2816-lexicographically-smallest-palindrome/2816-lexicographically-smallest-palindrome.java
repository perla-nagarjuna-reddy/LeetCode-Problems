class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for(int i = 0; i < n; i++){

            int  j = n - 1 - i;

            if(chars[i] != chars[j]){
                char smaller = (char) Math.min(chars[i], chars[j]);

                chars[i] = smaller;
            }
        }

        return new String(chars);
    }
}