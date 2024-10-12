class MapSum {
    HashMap<String,Integer> map;
    public MapSum() {
        map = new HashMap<>();;
    }
    
    public void insert(String key, int val) {
        if(map.containsKey(key)){
            map.put(key,val);
        }
        else{
            map.put(key,val);
        }
    }
    
    public int sum(String prefix) {
        int sum = 0;
        if(!map.isEmpty()){
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getKey().startsWith(prefix)){
                    sum+=entry.getValue();
                }
            }
            return sum;
        }

        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */