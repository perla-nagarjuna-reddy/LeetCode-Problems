class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0; i < responses.size(); i++){

            Set<String> set = new HashSet<>();

            for(int j = 0; j < responses.get(i).size(); j++){
                String st = responses.get(i).get(j);
                if(!set.contains(st)){
                    map.put(st,map.getOrDefault(st,0)+1);
                }
                set.add(st);
            } 
        }

        List<Map.Entry<String,Integer>> lst = new ArrayList<>(map.entrySet());

        lst.sort((a,b) ->{

            int freq = b.getValue().compareTo(a.getValue());

            if(freq == 0){
                return a.getKey().compareTo(b.getKey());
            }

            return freq;
        });

        return lst.get(0).getKey();
    }
}