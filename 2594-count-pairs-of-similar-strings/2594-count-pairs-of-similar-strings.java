class Solution {
    public int similarPairs(String[] words) {
        
        int ans = 0;

        for(int i = 0; i < words.length - 1; i++){

            for(int j = i+1; j < words.length; j++){
                int[] freq1 = new int[26];
                int[] freq2 = new int[26];
                for (char ch : words[i].toCharArray()) {
                    freq1[ch - 'a']++;
                }
                for (char ch : words[j].toCharArray()) {
                    freq2[ch - 'a']++;
                }
                boolean similar = true;
                for (int ind = 0; ind < 26; ind++) {
                    if ((freq1[ind] > 0 && freq2[ind] == 0) || (freq1[ind] == 0 && freq2[ind] > 0))                 {
                        similar = false;
                        break;
                    }
                }
                if (similar) {
                    ans++;
                }
            }
        }

        return ans;
    }
}