class Solution {
    public String sortString(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();

        while(!map.isEmpty()){

            for(char ch='a'; ch <= 'z'; ch++){

                if(map.containsKey(ch)){
                    
                    if(map.get(ch) == 0){
                        map.remove(ch);
                    }else{
                        sb.append(ch);
                        map.put(ch,map.get(ch) - 1);
                    }
                }
            }

            for(char ch='z'; ch >= 'a'; ch--){

                if(map.containsKey(ch)){
                    
                    if(map.get(ch) == 0){
                        map.remove(ch);
                    }else{
                        sb.append(ch);
                        map.put(ch,map.get(ch) - 1);
                    }
                }
            }
        }

        return sb.toString();
    }
}