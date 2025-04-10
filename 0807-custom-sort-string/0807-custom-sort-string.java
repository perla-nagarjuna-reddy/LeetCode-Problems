class Solution {
    public String customSortString(String order, String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : order.toCharArray()){
            int count = map.containsKey(ch)?map.get(ch):-1;

            if(count == 1){
                sb.append(ch);
            }
            else if(count > 1){
                for(int i = 0 ; i < count; i++){
                    sb.append(ch);
                }
            }
        }

        for(char ch : s.toCharArray()){
            if (sb.indexOf(String.valueOf(ch)) != -1) {
                continue;
            }
            else{
                int count = map.get(ch);

                for(int i = 0; i < count; i++){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}