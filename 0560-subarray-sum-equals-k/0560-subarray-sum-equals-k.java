class Solution {
    public int subarraySum(int[] nums, int k) {
        int preSum = 0;
        int count = 0;
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        preSumMap.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum = preSum + nums[i];
            if(preSumMap.containsKey(preSum - k)){
                // preSumMap.remove(preSum - k);
                count += preSumMap.get(preSum - k);
            }
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);

        }

        return count;
    }
}