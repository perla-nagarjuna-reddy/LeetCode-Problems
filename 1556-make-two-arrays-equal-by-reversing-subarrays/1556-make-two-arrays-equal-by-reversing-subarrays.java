class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : target){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for (int val : arr) {
            if (!map.containsKey(val) || map.get(val) == 0) {
                return false;
            }
            map.put(val, map.get(val) - 1);
        }
        for(int val : map.keySet()){
            if(map.get(val) != 0){
                 return false;
            }
        }

        return true;
    }
}