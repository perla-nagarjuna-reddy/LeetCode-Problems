class Solution {
    public int findFinalValue(int[] nums, int original) {


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num,1);
        }
        while(map.containsKey(original)){
            original = 2 * original;
        }


        return original;
    }
}