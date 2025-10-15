class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : friends){

            map.put(val,1);
        }

        int ind = 0;

        int[] ans = new int[friends.length];

        for(int val : order){

            if(map.containsKey(val)){
                ans[ind++] = val;
            }
        }

        return ans;
    }
}