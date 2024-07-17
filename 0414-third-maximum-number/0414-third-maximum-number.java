class Solution {
    public int thirdMax(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>(map.keySet());
        Collections.sort(ans);
        Collections.reverse(ans);

        if(ans.size() >= 3){

            return ans.get(2);
        }
        return ans.get(0);
        
    }
}