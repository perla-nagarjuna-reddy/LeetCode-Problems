class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == 'A') {
                absentCount++;
                if (absentCount >= 2) {
                    return false;
                }
            }

            if (i >= 2 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }

        }

        return absentCount < 2 ? true:false;
    }
}