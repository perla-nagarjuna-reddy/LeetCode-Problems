class Solution {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int upd = i - map.get(ch) - 1;

               if (upd != distance[ch - 'a']) {
                    return false;
                }
            }
            else{
                map.put(ch,i);
            }
        }

        return true;
    }
}