class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){

            char ch = s.charAt(i);

            char ch1 = t.charAt(i);

            if(map.containsKey(ch)){
                if(map.get(ch) != ch1){
                    return false;
                }
            }
            else{
                map.put(ch,ch1);
            }

            if(map1.containsKey(ch1)){
                if(map1.get(ch1) != ch){
                    return false;
                }
            }
            else{
                map1.put(ch1,ch);
            }

        }
        
        return true;
    }
}