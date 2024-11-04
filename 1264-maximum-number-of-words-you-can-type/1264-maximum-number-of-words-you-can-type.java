class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++){
            boolean iscontain = true;
            for(int j=0;j<brokenLetters.length();j++){
                if(words[i].indexOf(brokenLetters.charAt(j)) != -1){
                    iscontain = false;
                    break;
                }
            }

            if(iscontain == true){
                count++;
            }
        }

        return count;
    }
}