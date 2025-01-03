class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] frequency = new int[26]; 

        for (int i = 0; i < word1.length(); i++) {
            frequency[word1.charAt(i) - 'a']++;
            frequency[word2.charAt(i) - 'a']--;
        }
        
        for(int ch : frequency){
            
            if(Math.abs(ch) > 3){
                return false;
            }  
        }

        return true;
    }
}