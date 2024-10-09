class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int l=0;
        int r=0;
        while(l < s.length){
            if(r < g.length){
                if(g[r] <= s[l]){
                    r++;
                }
            }
            l++;
        }
        return r;
    }
}