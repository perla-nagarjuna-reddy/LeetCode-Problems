class Solution {
    public boolean detectCapitalUse(String word) {
        int smallCount = 0;
        int largeCount = 0;
        boolean flag = false;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if (i == 0 && ch >= 'A' && ch <= 'Z'){
                flag = true;
            }
            if (ch >= 'A' && ch <= 'Z'){
                largeCount++;
            }
            if (ch >= 'a' && ch <= 'z'){
                smallCount++;
            }
        }
        if(smallCount == 0 && largeCount == word.length()) return true;
        if(largeCount == 0 && smallCount == word.length()) return true;

        if(flag && largeCount == 1) return true;

        return false;

    }
}