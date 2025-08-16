class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int preSum = 0;

        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i = 0 ; i < nums.length; i++){

            preSum = preSum + nums[i];
            int remainder = ((preSum % k) + k) % k;
            if(map.containsKey(remainder)){
                count = count + map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder,0)+1);
        }

        return count;
    }
}