class Solution {
    public int minimizedStringLength(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        return map.size();

    }
}