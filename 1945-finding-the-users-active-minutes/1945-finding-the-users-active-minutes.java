class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>> map = new HashMap<>();

        for(int i  = 0; i < logs.length; i++){
            int[] log = logs[i];
            int userId = log[0];
            int minute = log[1];
            map.putIfAbsent(userId, new HashSet<>());
            map.get(userId).add(minute);
        }

        int[] ans = new int[k];

        Arrays.fill(ans,0);

        for(int key : map.keySet()){

            int val  = map.get(key).size();

            if(val <= k){
                ans[val - 1] = ans[val-1]+1;
            }
        }

        return ans;
    }
}