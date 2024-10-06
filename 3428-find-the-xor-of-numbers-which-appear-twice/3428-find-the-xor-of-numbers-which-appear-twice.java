class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int ans = 0;

        for(int val : map.keySet()){
            if(map.get(val) == 2){
                ans = ans^val;
            }
        }

        return ans;
    }
}