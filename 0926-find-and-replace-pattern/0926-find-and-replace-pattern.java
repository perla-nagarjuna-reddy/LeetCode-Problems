class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans =  new ArrayList<>();

        for(int i = 0; i < words.length ; i++){

            if(isIsomorphic(words[i],pattern)){
                ans.add(words[i]);
            }
        }

        return ans;
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }
            else{
                map.put(ch1,ch2);
            }
            if(map1.containsKey(ch2)){
                if(map1.get(ch2) != ch1){
                    return false;
                }
            }
            else{
                map1.put(ch2,ch1);
            }
        }


        return true;

    }
}