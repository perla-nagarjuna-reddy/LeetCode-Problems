class Pair{
    char ch;
    int count;

    public Pair(char ch, int count){
        this.ch = ch;
        this.count = count;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a, b ) -> {

            if(a.getValue() != b.getValue()){
                return b.getValue() - a.getValue();
            }
            else{
                return a.getValue() - b.getValue();
            }
        });

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : list){

            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return sb.toString();

    }
}