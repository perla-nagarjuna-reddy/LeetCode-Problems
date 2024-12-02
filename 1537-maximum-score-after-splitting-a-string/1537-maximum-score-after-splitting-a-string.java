class Solution {
    public int maxScore(String s) {
        int ans = 0;
        int count = 0;
        for(int i = 0; i < s.length()-1; i++){
            int count_one = 0;
            if(s.charAt(i) == '0'){
                count++;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count_one++;
                }
            }
            ans = Math.max(count+count_one,ans);
        }

        if(count == s.length()){
            return s.length() - 1;
        }

        return ans;
    }
}