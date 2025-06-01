class Solution {
    public int findCenter(int[][] edges) {

        int n = edges.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < edges.length; i++){

            for(int j = 0; j < 2; j++){

                map.put(edges[i][j],map.getOrDefault(edges[i][j],0)+1);
            }
        }

        for(int val : map.keySet()){

            if(map.get(val) == n){
                return val;
            }
        }

        return -1;
    }
}