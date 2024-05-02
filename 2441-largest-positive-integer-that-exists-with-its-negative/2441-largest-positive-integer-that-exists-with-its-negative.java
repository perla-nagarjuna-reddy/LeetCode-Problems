class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        
        int ans =  -1;
        
        for(int val : map.keySet()){
            if(map.containsKey(val) && map.containsKey(-val)){
                ans = Math.max(ans,val);
            }
        }
        
        return ans;
    }
}