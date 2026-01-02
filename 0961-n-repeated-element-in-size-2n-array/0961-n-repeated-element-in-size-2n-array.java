class Solution {
    public int repeatedNTimes(int[] nums) {
        
        int n = nums.length;

        int unq = n / 2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int val : map.keySet()){

            if(map.get(val) == unq) return val;
        }

        return -1;
    }
}