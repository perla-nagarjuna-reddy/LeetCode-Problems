class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();

        HashMap<String, Character> reverseMap = new HashMap<>();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for(int i = 0 ; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(!map.isEmpty() && map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
                else{

                } 
            }
            else if (reverseMap.containsKey(word)) {
                return false;
            } 
            else{
                map.put(ch,word);
                reverseMap.put(word,ch);
            }
        }

        return true;
    }
}