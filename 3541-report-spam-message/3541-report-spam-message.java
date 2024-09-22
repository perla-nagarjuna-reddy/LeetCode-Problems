class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<>();
        for(String word : bannedWords){
            set.add(word);
        }
        int count = 0;

        for(String word : message){
            if(set.contains(word)){
                count++;
            }
        }

        return (count >= 2)?true:false;
    }
}