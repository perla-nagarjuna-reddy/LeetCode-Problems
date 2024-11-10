class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        int n  = arr.length / 4;

        for(int val : map.keySet()){
            if(map.get(val) > n) {
                return val;
            }
        }

        return -1;

    }
}