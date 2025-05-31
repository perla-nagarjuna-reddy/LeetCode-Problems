class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        int maxVowel = Integer.MIN_VALUE;

        int maxConso = Integer.MIN_VALUE;

        for(char ch : map.keySet()){

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxVowel = Math.max(maxVowel,map.get(ch));
            }
            else{
                maxConso = Math.max(maxConso,map.get(ch));
            }
        }

        if(maxVowel == Integer.MIN_VALUE) maxVowel = 0;

        if(maxConso == Integer.MIN_VALUE) maxConso = 0;

        return maxVowel + maxConso;
    }
}