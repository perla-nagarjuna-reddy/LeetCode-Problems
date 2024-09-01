class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        
        int hash[] = new int[256];
        Arrays.fill(hash,-1);

        while(r < s.length()){
            if(hash[s.charAt(r)] != -1){
            
                if(hash[s.charAt(r)] >= l){
                    // System.out.println(r);
                    // System.out.println(hash[s.charAt(r)]);
                    l = hash[s.charAt(r)]+1;
                    System.out.println(l);
                }
            }

            max = Math.max(r-l+1,max);
            hash[s.charAt(r)] = r;
            r++;
        }

        return max;
    }
}