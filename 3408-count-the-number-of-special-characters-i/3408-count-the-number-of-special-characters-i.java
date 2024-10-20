class Solution {
    public int numberOfSpecialChars(String word) {
        if(word.length() == 1){
            return 0;
        }
        int[] small = new int[26];
        int[] upper = new int[26];
        for(int i = 0;i < word.length();i++){
            int ch =(char)word.charAt(i);
            if(ch >= 97 && ch <=122){
                small[ch-97]++;
            }
            else{
                upper[ch - 65]++;
            }
        }

        int count = 0;

        for(int i = 0;i < small.length;i++){
            if(small[i] != 0 && upper[i] != 0){
                count++;
            }
        }

        return count;

    }
}