class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        int maxVowel = 0;

        int maxConso = 0;

        for(char ch : map.keySet()){

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxVowel = Math.max(maxVowel,map.get(ch));
            }
            else{
                maxConso = Math.max(maxConso,map.get(ch));
            }
        }
        return maxVowel + maxConso;
    }
}