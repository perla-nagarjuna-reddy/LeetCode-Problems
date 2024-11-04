class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        Set<String> st = new HashSet<>();
        for(int i=0;i<words.length;i++){
            boolean iscontain = true;
            for(int j=0;j<brokenLetters.length();j++){
                if(words[i].indexOf(brokenLetters.charAt(j)) != -1){
                    iscontain = false;
                    break;
                }
                else{
                    st.add(words[i]);
                }
            }

            if(iscontain == true){
                count++;
            }
        }

        return count;
    }
}