class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {

        String word = licensePlate.toLowerCase();

        String lowerWord = word.replaceAll("[0-9\\s]", "");

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : lowerWord.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        int maxLen = Integer.MAX_VALUE;

        String ans = "";

        for(String s : words){

            if(checkValidOrNot(s,map)){
                
                int len = s.length();

                if(len < maxLen){
                    maxLen = len;
                    ans = s;
                }
            }
        }

        return ans;
    }

    public boolean checkValidOrNot(String s,HashMap<Character,Integer> map){
        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        // System.out.println(freq);
        for(char ch : map.keySet()){

            if (freq.getOrDefault(ch, 0) < map.get(ch)) {
                return false;
            }
        }

        return true;
    }
}