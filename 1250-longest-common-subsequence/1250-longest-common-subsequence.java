class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n][m];

        for(int i = 0 ; i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(text1.length() - 1,text2.length() - 1,text1,text2,dp);
    }

    public int solve(int ind1, int ind2,String st,String st1,int[][] dp){

        if(ind1 < 0 || ind2 < 0){
            return 0;
        }

        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }

        if(st.charAt(ind1) == st1.charAt(ind2)){
            return 1 + solve(ind1 - 1, ind2 - 1, st,st1,dp);
        }

        return dp[ind1][ind2] = Math.max(solve(ind1 - 1, ind2,st,st1,dp),solve(ind1, ind2 - 1,st,st1,dp));
    }
}