class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(int val : arr){
            if(map.get(val) == val){
                ans = Math.max(ans,val);
            }
        }

        return ans;
    }
}