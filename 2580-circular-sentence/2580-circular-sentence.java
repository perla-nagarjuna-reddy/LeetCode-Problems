class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] words = sentence.split(" ");
        if(words.length == 1){
            if(words[0].charAt(0) != words[0].charAt(words[0].length() - 1)){
                return false;
            }
        }
        for(int i=0;i<words.length - 1;i++){
            char lastChar = words[i].charAt(words[i].length()-1);
            char firstChar = words[i+1].charAt(0);
            if(lastChar != firstChar){
                return false;
            }
        }
        char lastWordChar = words[words.length - 1].charAt(words[words.length - 1].length() - 1);
        char firstWordChar = words[0].charAt(0);
        return lastWordChar == firstWordChar;
    }
}