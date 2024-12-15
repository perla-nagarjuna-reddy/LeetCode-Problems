class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int val : nums){
            if(map.containsKey(val)){
                count++;
                map.remove(val);
            }
            else{
                map.put(val,1);
            }
        }

        return new int[]{count,map.size()};
    }
}