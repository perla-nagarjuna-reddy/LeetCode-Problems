class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String,String> map = new HashMap<>();

        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < paths.size(); i++){

            for(int j = 0 ; j < paths.get(i).size(); j++){

                map.put(paths.get(i).get(0),paths.get(i).get(1));
                set.add(paths.get(i).get(0));
                set.add(paths.get(i).get(1));
            }
        }


        for(String st : set){

            if(!map.containsKey(st)){
                return st;
            }
        }

        return "";
    }
}