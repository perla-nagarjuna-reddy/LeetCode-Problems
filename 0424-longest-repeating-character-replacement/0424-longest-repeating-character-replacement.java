class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];

        int l = 0;
        int r = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        while(r < s.length()){
            hash[s.charAt(r)-'A']++;
            maxFrequency = Math.max(maxFrequency, hash[s.charAt(r)-'A']);
            if((r-l+1) - maxFrequency > k){
                hash[s.charAt(l)-'A']--;
                maxFrequency = 0;

                for(int i=0;i<=25;i++){
                    maxFrequency = Math.max(maxFrequency,hash[i]);
                }
                l++;
            }

            if((r-l+1)-maxFrequency <=k){
                maxLength = Math.max(maxLength,r-l+1);
            }
            r++;
        } 

        return maxLength;
    }
}