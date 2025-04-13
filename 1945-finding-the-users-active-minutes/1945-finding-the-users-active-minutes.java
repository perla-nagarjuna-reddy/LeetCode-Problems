class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i  = 0; i < logs.length; i++){

            int[] temp = logs[i];

            if(map.containsKey(temp[0])){
                if(!map.get(temp[0]).contains(temp[1])){
                   List<Integer> ls = map.get(temp[0]);

                   ls.add(temp[1]);

                   map.put(temp[0],ls);
                }
            }
            else{
                    List<Integer> temp1 = new ArrayList<>();
                    temp1.add(temp[1]);
                    map.put(temp[0],temp1);
            }
        }

        int[] ans = new int[k];

        Arrays.fill(ans,0);

        for(int key : map.keySet()){

            int val  = map.get(key).size();

            ans[val - 1] = ans[val-1]+1;
        }

        return ans;
    }
}