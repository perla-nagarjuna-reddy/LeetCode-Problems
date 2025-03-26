class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;

        int[] ans = new int[n];

        int ind  = 1;

        ans[0] = pref[0];

        for(int i = 1; i < n; i++){

            int bit = pref[i-1]^pref[i];

            ans[ind++] = bit;
        }

        return ans;
    }
}