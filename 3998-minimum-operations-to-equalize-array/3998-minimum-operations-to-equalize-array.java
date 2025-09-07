class Solution {
    public int minOperations(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int val :  nums){
            set.add(val);
        }

        if(set.size() == 1) return 0;

        return 1; 

    }
}