class Solution {
    public int countAsterisks(String s) {
        if(s.length() == 1){
            return 0;
        }
        int count = 0;

        int ans  = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*' && count == 0){
                ans++;
            }
            else if (s.charAt(i) == '|' && count == 0){
                count++;
            }
            else if (s.charAt(i) == '|' && count == 1){
                count--;
            }
        }

        return ans;
    }
}