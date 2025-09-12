class Solution {
    public boolean doesAliceWin(String s) {

        int vowelCount = 0;

        for(char ch : s.toCharArray()){

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }

        return vowelCount > 0 ? true : false;
    }
}