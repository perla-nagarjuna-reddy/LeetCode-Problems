class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            if(hm.containsKey(s1.charAt(i))){
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
            }
            else{
                hm.put(s1.charAt(i),1);
            }
        }
        int update = 0;
        for(int i = 0;i<s2.length();i++){
            if(!hm.containsKey(s2.charAt(i))){
                return false;
            }
            if(hm.get(s2.charAt(i)) > 0){
                hm.put(s2.charAt(i),hm.get(s2.charAt(i)) - 1);
                if(s1.charAt(i) != s2.charAt(i)){
                    update+=1;
                }
            }
            if(hm.get(s2.charAt(i)) == 0){
                hm.remove(s2.charAt(i));
            }
        }
        return update == 2 || update == 0;
    }
}