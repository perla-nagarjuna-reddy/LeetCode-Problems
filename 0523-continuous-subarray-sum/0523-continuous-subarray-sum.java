class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int preSum = 0;
        int count = 0;
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, -1);
        for(int i=0;i< nums.length;i++){
            preSum = preSum + nums[i];
            int rem = preSum % k ;
            if(preSumMap.containsKey(rem)){

                int len = i - preSumMap.get(rem);
                
                if(len >= 2) return true;
            }

            if (!preSumMap.containsKey(rem)) {
                preSumMap.put(rem, i);
            }
        }
        return false;
    }
}