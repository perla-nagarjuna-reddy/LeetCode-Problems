class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ind = 0;

        for(int  val : map.keySet()){
            if(map.get(val) >1){
                ans[ind++]=val;
            }
        }

        return ans;

    }
}